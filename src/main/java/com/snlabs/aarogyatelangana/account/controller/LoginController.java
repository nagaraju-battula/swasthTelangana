
package com.snlabs.aarogyatelangana.account.controller;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.service.AccountService;
import com.snlabs.aarogyatelangana.account.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    public AccountService accountService;

    private AccountUtils accountUtils = new AccountUtils();

    @RequestMapping(value = {"loginsubmission.action"}, method = RequestMethod.POST)
    public ModelAndView loginsubmission(@RequestBody LoginUser loginUser,
                                        ModelMap model) {
        ModelAndView modelAndView = null;
        try {
            modelAndView = new ModelAndView();
            loginUser.setPassword(loginUser.getPassword());
            UserDetails userDetails = accountService
                    .getAccountDetails(loginUser);
            if (userDetails != null) {
                model.put("userDetails", userDetails);
                modelAndView.setViewName("workdesk");
            } else {
                model.put("result", "Invalid User Name(OR) Password");
                modelAndView.setViewName("login");
            }
        } catch (Exception e) {
            model.put("result", "Failed to login" + e.getMessage());
        }
        return modelAndView;
    }

    @RequestMapping(value = {"createaccountsubmission.action"}, method = RequestMethod.POST)
    public String createaccountsubmission(@RequestBody NewUser user,
                                          ModelMap model) {
        boolean result = accountService.createAccount(user);
        String view = null;
        view = result ? "createaccountsubmissionsucscess"
                : "createaccountsubmissionfail";

        return view;
    }

    @RequestMapping(value = {"updateaccount.action"}, method = RequestMethod.POST)
    public String updateaccount(ModelMap model) {
        // Show patient entry form, Log the request.
        return "updateaccount";
    }

    @RequestMapping(value = {"updateaccountsubmission.action"}, method = RequestMethod.POST)
    public String updateaccountsubmission(@RequestBody NewUser user,
                                          ModelMap model) {
        // Show patient entry form, Log the request.

        String hashedPassword = accountUtils.md5(user.getPassword());
        user.setPassword(hashedPassword);
        String view = null;
        /*
         * boolean result = accountService.upodateAccount(user);
		 * 
		 * String view = null; view =
		 * result?"updateaccountsubmissionsuccess":"updateaccountsubmissionfail"
		 * ;
		 */
        //Test 02
        
        return view;
    }

    
    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

}