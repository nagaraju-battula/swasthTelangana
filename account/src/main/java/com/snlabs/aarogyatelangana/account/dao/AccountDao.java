
package com.snlabs.aarogyatelangana.account.dao;

import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;

public interface AccountDao {
	
	public boolean createAccount(NewUser user);

	public UserDetails getAccountDetails(LoginUser user);

}
