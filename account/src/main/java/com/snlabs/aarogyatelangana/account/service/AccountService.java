/**
 * 
 */
package com.snlabs.aarogyatelangana.account.service;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;

/**
 * @author nbattula
 *
 */
public interface AccountService {
	
	public boolean createAccount(NewUser user);
	
	public UserDetails getAccountDetails(LoginUser user);
	
	
}
