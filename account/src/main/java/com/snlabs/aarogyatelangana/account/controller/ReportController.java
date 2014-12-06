package com.snlabs.aarogyatelangana.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController {
   
	@RequestMapping(value = {"patientNameReportDetails.action"} ,method = RequestMethod.POST)
	public String viewPatientNameReportOptions(ModelMap map){
		return "patientNameReport";
	}
	@RequestMapping(value = {"patientIdReportDetails.action"} ,method = RequestMethod.POST)
	public String viewPatientIdReportOptions(ModelMap map){
		return "patientIdReport";
	}
	@RequestMapping(value = {"formIdReportDetails.action"} ,method = RequestMethod.POST)
	public String viewFormIdReportOptions(ModelMap map){
		return "formIdReport";
	}
	@RequestMapping(value = {"formDateReportDetails.action"} ,method = RequestMethod.POST)
	public String viewDateRangeReportOptions(ModelMap map){
		return "formDateReport";
	}
		
}
