package com.snlabs.aarogyatelangana.account.service.impl;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.dao.AccountDao;
import com.snlabs.aarogyatelangana.account.service.AccountService;

public class AccountServiceImpl implements AccountService{
	
	public AccountDao accountDao;

	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createAccount(NewUser user, UserDetails userDetails) {
		return accountDao.createAccount(user, userDetails);
	}

	@Override
	public UserDetails getAccountDetails(LoginUser user) {
		// TODO Auto-generated method stub
		return accountDao.getAccountDetails(user);
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public boolean updateAccount(NewUser user) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(user);
	}
	
}
