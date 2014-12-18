package com.snlabs.aarogyatelangana.account.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	public PatientService patientService;

	@RequestMapping(value = { "enterPatientDetails.action" }, method = RequestMethod.POST)
	public String enterPatientDetails(ModelMap model, HttpSession session) {
		session.removeAttribute("saveResult");
		return "patientForm";
	}
	
	@RequestMapping(value = { "savePatientDetails.action" }, method = RequestMethod.POST)
	public String savePatientDetails(@RequestBody Patient patient, HttpSession session,
			ModelMap model) {
		String view = "patientForm";
		int patientId = patientService.createPatientRecord(patient);
		try{
			if(patientId > 0){
				session.setAttribute("saveResult", "Well done! You successfully saved the Patient Form."+
						"Keep this Patient Id for future Reference:"+ patientId);
				session.setAttribute("patientName",patient.getPatientName());
				//Redirect the form to formF page when patient entry it successful.
				view = "form";
			}else{
				model.put("saveResult", "Oh snap! Failed Please check the whether you Entered Details Correctly or not.");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}		
		return view;
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	@RequestMapping(value = { "searchReportByPatientId.action" }, method = RequestMethod.POST)
	public String searchReportByPatientId(@RequestBody Patient patient,
			HttpSession session, ModelMap map) {
		Integer patientId = Integer
				.parseInt(patient.getPatientId());
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

	@RequestMapping(value = { "searchReportByPatientName.action" }, method = RequestMethod.POST)
	public String searchReportByPatientName(@RequestBody Patient patient,
			HttpSession session, ModelMap map) {
		session.setAttribute("patientId", null);
		session.setAttribute("patientName", patient.getPatientName());
		Patient resultForm = patientService.searchPatientByName(patient.getPatientName());
		session.setAttribute("form", resultForm);
		System.out.println(resultForm);
		if (resultForm != null) {
			return "viewPatientResultform";
		} else {
			return "errorResultForm";
		}
	}
}
