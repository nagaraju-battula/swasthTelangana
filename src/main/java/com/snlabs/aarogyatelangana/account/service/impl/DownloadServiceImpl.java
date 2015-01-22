package com.snlabs.aarogyatelangana.account.service.impl;

import com.snlabs.aarogyatelangana.account.dao.DownloadDao;
import com.snlabs.aarogyatelangana.account.service.DownloadService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;

public class DownloadServiceImpl implements DownloadService {

	DownloadDao downloadDao;

	@Override
	public File downloadForm(int patientID, HttpServletRequest request, HttpSession session) {
		return downloadDao.downloadDetails(patientID, request, session);
		/*if (session.getAttribute("patientId") != null
				|| session.getAttribute("patientName") != null) {
			return downloadDao.downloadExcelPatient(request, session);
		} else if (session.getAttribute("formId") != null) {
			return downloadDao.downloadExcelForm(request, session);
		} else {
			downloadDao.downloadDetails(request, session);
		}*/
		
	}

	public DownloadDao getDownloadDao() {
		return downloadDao;
	}

	public void setDownloadDao(DownloadDao downloadDao) {
		this.downloadDao = downloadDao;
	}

}
