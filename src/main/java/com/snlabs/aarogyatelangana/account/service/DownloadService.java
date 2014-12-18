package com.snlabs.aarogyatelangana.account.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface DownloadService {
     
	public File downloadForm(HttpServletRequest request,HttpSession session);
}
