package com.snlabs.aarogyatelangana.account.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.service.FormService;

@Controller
public class FormController {
	
	@Autowired
	public FormService formService;

	@RequestMapping(value = { "enterFormDetails.action" }, method = RequestMethod.POST)
	public String enterFormDetails(HttpSession session) {
		session.setAttribute("saveResult", null);
		ArrayList<Integer> patientIDs = new ArrayList<Integer>();
		patientIDs.add(123);
		patientIDs.add(456);
		
		session.setAttribute("patientIDs",patientIDs);
		return "form";
	}

	@RequestMapping(value = { "saveDetails.action" }, method = RequestMethod.POST)
	public String saveFormDetails(@RequestBody Form form,HttpSession session,
			ModelMap model) {
		System.out.println(" form >> "+form.getClinicAddress().getClinicName());
		System.out.println(" form >> "+form.getClinicAddress().getAddress());
		System.out.println(" form >> "+form.getClinicAddress().getPincode());
		System.out.println(" form >> "+form.getClinicAddress().getDistrict());
		System.out.println(" form >> "+form.getClinicAddress().getState());
		int formId = formService.createForm(form);
		try{
			if(formId >0){
				session.setAttribute("saveResult", "Well done! You successfully saved the Form Details."+
							"Keep this Form Id for future Reference:"+ formId);
			}else{
				session.setAttribute("saveResult", "Oh snap! Failed Please check the whether you created Patient Form for this Patient Name.");
			}		  	
		}catch(Exception e){
			e.printStackTrace();
		}	
		return "form";
	}
	
	@RequestMapping(value = {"searchReportByFormId.action"} ,method = RequestMethod.POST)
	public String searchReportByFormId(@RequestBody Form form,HttpSession session,ModelMap map){
		int formId = Integer.parseInt(form.getSearchFormId());
		session.setAttribute("formId",formId);
		session.setAttribute("patientId", null);
		session.setAttribute("patientName", null);
		Form resultForm = formService.searchForm(formId);
		session.setAttribute("form", resultForm);
		System.out.println(resultForm);
		if(resultForm != null){
			return "viewFormResultform";
		}else{
			return "errorResultForm";			
		}
	}
	@RequestMapping(value = {"searchReportByDateRange.action"} ,method = RequestMethod.POST)
	public String searchReportByDateRange(@RequestBody Form form,HttpSession session,ModelMap map){
		Form resultForm = formService.searchFormByDateRange(form.fromDate, form.toDate);
		session.setAttribute("form", resultForm);
		System.out.println(resultForm);
		if(resultForm != null){
			return "viewFormDateRangeResultform";
		}else{
			return "errorResultForm";			
		}
	}
	
	@RequestMapping(value = { "viewFormDetails.action" }, method = RequestMethod.POST)
	public String viewFormDetails(@RequestBody Form form,HttpSession session, ModelMap model) {
		Form resultForm = formService.searchForm(Integer.parseInt(form.getSearchFormId()));
		session.setAttribute("form", resultForm);
		System.out.println(resultForm);
		if(resultForm != null){
			return "viewResultform";
		}else{
			return "errorResultForm";			
		}
	}
	

	public FormService getFormService() {
		return formService;
	}

	public void setFormService(FormService formService) {
		this.formService = formService;
	}
}
