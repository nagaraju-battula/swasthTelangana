package com.snlabs.aarogyatelangana.account.service.impl;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.snlabs.aarogyatelangana.account.dao.DownloadDao;
import com.snlabs.aarogyatelangana.account.service.DownloadService;

public class DownloadServiceImpl implements DownloadService {
	
	DownloadDao downloadDao;
	@Override
	public File downloadForm(HttpServletRequest request,HttpSession session) {
		if(session.getAttribute("patientId")!= null || session.getAttribute("patientName")!= null){
			return downloadDao.downloadExcelPatient(request,session);	
		}else if(session.getAttribute("formId")!= null){
			return downloadDao.downloadExcelForm(request,session);
		}	
		return null;
	}
	public DownloadDao getDownloadDao() {
		return downloadDao;
	}
	public void setDownloadDao(DownloadDao downloadDao) {
		this.downloadDao = downloadDao;
	}

}
