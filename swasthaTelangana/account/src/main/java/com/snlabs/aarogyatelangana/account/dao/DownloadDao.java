package com.snlabs.aarogyatelangana.account.dao;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface DownloadDao {
   
	public File downloadExcelForm(HttpServletRequest request,HttpSession session);
	public File downloadExcelPatient(HttpServletRequest request,HttpSession session);
	public File downloadDetails(HttpServletRequest request,HttpSession session);
	
}
