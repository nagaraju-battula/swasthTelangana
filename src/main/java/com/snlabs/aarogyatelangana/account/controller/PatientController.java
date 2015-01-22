package com.snlabs.aarogyatelangana.account.controller;

import com.snlabs.aarogyatelangana.account.beans.ClinicAddress;
import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PatientController {

    @Autowired
    public PatientService patientService;

    @RequestMapping(value = {"enterPatientDetails.action"}, method = RequestMethod.POST)
    public String enterPatientDetails(HttpSession session, ModelMap model) {
        model.put("loginID", UserDetails.getLoginId());

        return "patientForm";
    }

    @RequestMapping(value = {"savePatientDetails.action"}, method = RequestMethod.POST)
    public String savePatientDetails(@RequestBody Patient patient,
                                     HttpSession session, ModelMap model) {
        Patient result = patientService.createPatientRecord(patient);
        if (result != null) {
            model.put("patient", result);
            model.put("result", "Success");
        }
        return "patientForm";
    }

    @RequestMapping(value = {"patientProfiles.action"}, method = RequestMethod.POST)
    public String patientProfiles(HttpSession session, ModelMap model) {
        List<Patient> patientProfiles = patientService
                .getPatientProfiles(UserDetails.getLoginId());
        try {
            if (patientProfiles != null) {
                model.put("result", true);
                model.put("patientProfiles", patientProfiles);
            } else {
                model.put("result", false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "patientProfiles";
    }

    @RequestMapping(value = {"savePatientDetailsAndContinue.action"}, method = RequestMethod.POST)
    public String savePatientDetailsAndContinue(@RequestBody Patient patient,
                                                HttpSession session, ModelMap model) {
        try {
            if (patientService.createPatientRecord(patient) != null) {
                ClinicAddress clinicAddress = new ClinicAddress();
                clinicAddress.setPatientID(patient.getPatientId());
                clinicAddress.setPatientName(patient.getPatientName());
                model.put("clinicAddress", clinicAddress);
                System.out.print("Clinic address " + clinicAddress);
                return "clinicDetails";
            } else {
                session.setAttribute(
                        "saveResult",
                        "Oh snap! Failed Please check the whether you Entered Details Correctly or not.");
                return "patientForm";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PatientService getPatientService() {
        return patientService;
    }

    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping(value = {"searchReportByPatientId.action"}, method = RequestMethod.POST)
    public String searchReportByPatientId(@RequestBody Patient patient,
                                          HttpSession session, ModelMap map) {
        Integer patientId = patient.getPatientId();
        Patient resultForm = patientService.searchPatientById(patientId);
        session.setAttribute("form", resultForm);
        session.setAttribute("patientId", patient.getPatientId());
        session.setAttribute("patientName", null);
        if (resultForm != null) {
            return "viewPatientResultform";
        } else {
            return "errorResultForm";
        }
    }

    @RequestMapping(value = {"searchReportByPatientName.action"}, method = RequestMethod.POST)
    public String searchReportByPatientName(@RequestBody Patient patient,
                                            HttpSession session, ModelMap map) {
        session.setAttribute("patientId", null);
        session.setAttribute("patientName", patient.getPatientName());
        Patient resultForm = patientService.searchPatientByName(patient
                .getPatientName());
        session.setAttribute("form", resultForm);
        System.out.println(resultForm);
        if (resultForm != null) {
            return "viewPatientResultform";
        } else {
            return "errorResultForm";
        }
    }
}
