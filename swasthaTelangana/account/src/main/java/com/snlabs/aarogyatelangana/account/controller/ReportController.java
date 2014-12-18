package com.snlabs.aarogyatelangana.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController {
	
	@RequestMapping(value = {"/","home.action"} ,method = RequestMethod.GET)
	public String loginpage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = {"patiantentry.action"} ,method = RequestMethod.POST)
	public String patiantentry(ModelMap model) {
		return "patiantentry";
	}
	
	@RequestMapping(value = {"totalfinancereport.action"} ,method = RequestMethod.POST)
	public String totalfinancereport(ModelMap modelMap) {		
		return "totalfinancereport";
	}
	
	@RequestMapping(value = {"formf.action"} ,method = RequestMethod.POST)
	public String formf(ModelMap model) {
		return "formf";
	}
	
	@RequestMapping(value = {"formfreport.action"} ,method = RequestMethod.POST)
	public String formfreport(ModelMap model) {
		return "formfreport";
	}
	
	@RequestMapping(value = {"userAccounttab.action"} ,method = RequestMethod.POST)
	public String userAccount(ModelMap model) {
		return "useraccountlhn";
	}
	
	@RequestMapping(value = {"accountmanagementtab.action"} ,method = RequestMethod.POST)
	public String accountmanagement(ModelMap model) {
		return "accountmanagementlhn";
	}
	
	@RequestMapping(value = {"backtohome.action"} ,method = RequestMethod.POST)
	public String backtohome(ModelMap model) {
		return "backtohome";
	}
	
	@RequestMapping(value = {"createaccount.action"} ,method = RequestMethod.POST)
	public String createaccount(ModelMap model) {
		return "createaccount";
	}
	
	@RequestMapping(value = {"newpatiententrytab.action"} ,method = RequestMethod.POST)
	public String newpatiententrytab(ModelMap model) {
		return "patiententrylhn";
	}
	
	@RequestMapping(value = {"formftab.action"} ,method = RequestMethod.POST)
	public String formftab(ModelMap model) {
		return "formflhn";
	}
	
	@RequestMapping(value = {"underconstruction.action"} ,method = RequestMethod.POST)
	public String underconstruction(ModelMap model) {
		return "underconstruction";
	}
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
