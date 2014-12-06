/**
 * 
 */
package com.snlabs.aarogyatelangana.account.controller;

/**
 * @author nbattula
 *
 */
import javax.servlet.http.HttpSession;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.service.AccountService;
import com.snlabs.aarogyatelangana.account.utils.AccountUtils;

@Controller
public class LoginController {
	
	static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	public AccountService accountService;
	
	private AccountUtils accountUtils = new AccountUtils();
	
	@RequestMapping("/home.action")
	public String loginpage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = {"loginsubmission.action"} ,method = RequestMethod.POST)
	public String loginsubmission(@RequestBody LoginUser loginUser, HttpSession session, ModelMap modelMap) {	
		logger.debug("Trying to login with user name {}"+loginUser.getUserName());
		loginUser.setPassword(accountUtils.md5(loginUser.getPassword()));		
		UserDetails userDetails = accountService.getAccountDetails(loginUser);		
		if(userDetails != null){
			session.setAttribute("userDetails", userDetails);
			return "workdesk";
		}
		System.out.println("user details:"+userDetails);
		return "home";
	}
	
	@RequestMapping(value = {"patiantentry.action"} ,method = RequestMethod.POST)
	public String patiantentry(ModelMap model) {
		//Show patient entry form, Log the request.
		return "patiantentry";
	}
	
	@RequestMapping(value = {"totalfinancereport.action"} ,method = RequestMethod.POST)
	public String totalfinancereport(ModelMap modelMap) {
		//Show patient entry form, Log the request.
		return "totalfinancereport";
	}
	
	@RequestMapping(value = {"formf.action"} ,method = RequestMethod.POST)
	public String formf(ModelMap model) {
		//Show patient entry form, Log the request.
		return "formf";
	}
	
	@RequestMapping(value = {"formfreport.action"} ,method = RequestMethod.POST)
	public String formfreport(ModelMap model) {
		//Show patient entry form, Log the request.
		return "formfreport";
	}
	
	@RequestMapping(value = {"accountmanagement.action"} ,method = RequestMethod.POST)
	public String accountmanagement(ModelMap model) {
		//Show patient entry form, Log the request.
		return "accountmanagement";
	}
	
	@RequestMapping(value = {"backtohome.action"} ,method = RequestMethod.POST)
	public String backtohome(ModelMap model) {
		//Show patient entry form, Log the request.
		return "backtohome";
	}
	
	@RequestMapping(value = {"createaccount.action"} ,method = RequestMethod.POST)
	public String createaccount(ModelMap model) {
		//Show patient entry form, Log the request.
		return "createaccount";
	}
	
	@RequestMapping(value = {"createaccountsubmission.action"} ,method = RequestMethod.POST)
	public String createaccountsubmission(@RequestBody NewUser user, ModelMap model) {
		//Show patient entry form, Log the request.
		
		String hashedPassword = accountUtils.md5(user.getPassword());
		user.setPassword(hashedPassword);
		
		boolean result = accountService.createAccount(user);
		
		String view = null;
		view = result?"createaccountsubmissionsucscess":"createaccountsubmissionfail";
		
		return view;
	}
	
	@RequestMapping(value = {"updateaccount.action"} ,method = RequestMethod.POST)
	public String updateaccount(ModelMap model) {
		//Show patient entry form, Log the request.
		return "updateaccount";
	}

	@RequestMapping(value = {"updateaccountsubmission.action"} ,method = RequestMethod.POST)
	public String updateaccountsubmission(@RequestBody NewUser user, ModelMap model) {
		//Show patient entry form, Log the request.
		
		String hashedPassword = accountUtils.md5(user.getPassword());
		user.setPassword(hashedPassword);
		String view = null;
		/*boolean result = accountService.upodateAccount(user);
		
		String view = null;
		view = result?"updateaccountsubmissionsuccess":"updateaccountsubmissionfail";
		*/
		return view;
	}
	
	@RequestMapping(value = {"underconstruction.action"} ,method = RequestMethod.POST)
	public String underconstruction(ModelMap model) {
		//Show patient entry form, Log the request.
		return "underconstruction";
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
}