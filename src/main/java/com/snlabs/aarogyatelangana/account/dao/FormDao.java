package com.snlabs.aarogyatelangana.account.dao;

import java.util.List;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.User;

public interface FormDao {
	 public int save(Form form);
     public boolean update(Form form);
     public Form findByFormId(int formId);
     public boolean delete(Form patient);
     public Form findByFromName(String formName);
     public Form searchFormByDateRange(String fromDate, String toDate);
}
