package com.snlabs.aarogyatelangana.account.service;

import javax.servlet.http.HttpSession;

import com.snlabs.aarogyatelangana.account.beans.Form;

public interface FormService {
   public int createForm(Form form);
   public Form searchForm(int formId);
   public Form searchFormByDateRange(String fromDate, String toDate);
}
