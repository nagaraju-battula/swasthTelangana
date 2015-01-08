package com.snlabs.aarogyatelangana.account.controller;

import com.snlabs.aarogyatelangana.account.beans.*;
import com.snlabs.aarogyatelangana.account.service.DownloadService;
import com.snlabs.aarogyatelangana.account.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class FormController {

	@Autowired
	public FormService formService;
	
	@Autowired
	DownloadService downloadService;

	@RequestMapping(value = { "enterFormDetails.action" }, method = RequestMethod.POST)
	public String enterFormDetails(HttpSession session) {
		session.setAttribute("saveResult", null);
		ArrayList<Integer> patientIDs = new ArrayList<Integer>();
		session.setAttribute("patientIDs", patientIDs);
		return "form";
	}

	/*
	 * save Form Details
	 */

	@RequestMapping(value = { "saveClinicDetails.action" }, method = RequestMethod.POST)
	public String saveClinicDetails(@RequestBody Form form,
			HttpSession session, ModelMap model) {
		int result = formService.createForm(form);
		try {
			if (result > 0) {
				model.put("patientID", form.getPatient().getPatientId());
				model.put("patientName", form.getPatient().getPatientName());
			} else {
				model.put(
						"saveResult",
						"Oh snap! Failed Please check the whether you created Patient Form for this Patient Name.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "sectionA";
	}

	/*
	 * Save SectionA details
	 */

	@RequestMapping(value = { "saveSectionA.action" }, method = RequestMethod.POST)
	public String saveSectionADetails(@RequestBody SectionA sectionA,
			HttpSession session, ModelMap model) {
		int result = formService.saveSectionA(sectionA);
		try {
			if (result > 0) {
				model.put("patientID", sectionA.getPatientID());
				model.put("patientName", sectionA.getPatientName());
				model.put("diagnoseDetails", NonInvasive.getDiagnoseDetails());
				model.put("procedures", NonInvasive.getProcedures());

			} else {
				model.put(
						"saveResult",
						"Oh snap! Failed Please check the whether you created Patient Form for this Patient Name.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "nonInvasive";
	}

	/*
	 * Save non Invasive Details
	 */
	@RequestMapping(value = { "saveNonInvasiveDetails.action" }, method = RequestMethod.POST)
	public String saveNonInvasiveDetails(@RequestBody NonInvasive nonInvasive,
			HttpSession session, ModelMap model) {
		int formId = formService.saveNonInvasiveDetails(nonInvasive);
		try {
			if (formId > 0) {
				model.put("patientID", nonInvasive.getPatientID());
				model.put("patientName", nonInvasive.getPatientName());
				model.put("diagnosisBasis", Invasive.getDiagnosisBasis());
				model.put("diagnosisIndication",
						Invasive.getDiagnosisIndication());
				model.put("invasiveProcedures",
						Invasive.getInvasiveProcedures());
			} else {
				model.put(
						"saveResult",
						"Oh snap! Failed Please check the whether you created Patient Form for this Patient Name.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "invasive";
	}

	/*
	 * Save Invasive Details
	 */
	@RequestMapping(value = { "saveInvasiveDetails.action" }, method = RequestMethod.POST)
	public String saveInvasiveDetails(@RequestBody Invasive invasive,
			HttpSession session, ModelMap model) {
		int formId = formService.saveInvasiveDetails(invasive);
		try {
			if (formId > 0) {
				model.put("patientID", invasive.getPatientID());
				model.put("patientName", invasive.getPatientName());
				model.put("doctorName", invasive.getDoctorName());
			} else {
				model.put(
						"saveResult",
						"Oh snap! Failed Please check the whether you created Patient Form for this Patient Name.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "declaration";
	}

	@RequestMapping(value = { "searchReportByFormId.action" }, method = RequestMethod.POST)
	public String searchReportByFormId(@RequestBody Form form,
			HttpSession session, ModelMap map) {
		int formId = Integer.parseInt(form.getSearchFormId());
		session.setAttribute("formId", formId);
		session.setAttribute("patientId", null);
		session.setAttribute("patientName", null);
		Form resultForm = formService.searchForm(formId);
		session.setAttribute("form", resultForm);
		if (resultForm != null) {
			return "viewFormResultform";
		} else {
			return "errorResultForm";
		}
	}

	@RequestMapping(value = { "searchReportByDateRange.action" }, method = RequestMethod.POST)
	public String searchReportByDateRange(@RequestBody Form form,
			HttpSession session, ModelMap map) {
		Form resultForm = formService.searchFormByDateRange(form.fromDate,
				form.toDate);
		if (resultForm != null) {
			return "viewFormDateRangeResultform";
		} else {
			map.put("Failed", "No Records Found Between These Dates");
			return "formDateReport";
		}
	}

	@RequestMapping(value = { "viewFormDetails.action" }, method = RequestMethod.POST)
	public String viewFormDetails(@RequestBody Form form, HttpSession session,
			ModelMap model) {
		Form resultForm = formService.searchForm(Integer.parseInt(form
				.getSearchFormId()));
		session.setAttribute("form", resultForm);
		if (resultForm != null) {
			return "viewResultform";
		} else {
			return "errorResultForm";
		}
	}

	@RequestMapping(value = { "saveDeclarationDetails.action" }, method = RequestMethod.POST)
	public String saveDeclaration(@RequestBody Declaration declaration,
			HttpSession session, ModelMap model,HttpServletRequest request) {		
		if (formService.saveDeclarationDetails(declaration) > 0) {
			model.put("message", "Saved Successfully");
			downloadService.downloadForm(request, session);
			return "declaration";
		} else {
			model.put("message", "Failed");
			return "failed";
		}
	}

	public FormService getFormService() {
		return formService;
	}

	public void setFormService(FormService formService) {
		this.formService = formService;
	}
	
	public DownloadService getDownloadService() {
		return downloadService;
	}

	public void setDownloadService(DownloadService downloadService) {
		this.downloadService = downloadService;
	}
}
