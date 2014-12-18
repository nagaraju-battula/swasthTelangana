/**
 * 
 */
package com.snlabs.aarogyatelangana.account.service;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.beans.NewUser;

/**
 * @author nbattula
 *
 */
public interface AccountService {
	
	public boolean createAccount(NewUser user, UserDetails userDetails);
	
	public UserDetails getAccountDetails(LoginUser user);

	public boolean updateAccount(NewUser user);
}
