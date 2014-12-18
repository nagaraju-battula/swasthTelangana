package com.snlabs.aarogyatelangana.account.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snlabs.aarogyatelangana.account.service.DownloadService;

  
@Controller
public class DownloadController {
	
	@Autowired
	DownloadService downloadService;
	
	private static final int BUFFER_SIZE = 4096;
	
	@RequestMapping(value={"downLoadForm.action"}, method=RequestMethod.GET)
	public void downLoadReport(HttpServletRequest request,HttpSession session, HttpServletResponse response,ModelMap map){
		System.out.println(" Patient ID :"+session.getAttribute("patientId"));
		System.out.println(" Patient Name :"+session.getAttribute("patientName"));
		System.out.println(" Form ID :"+session.getAttribute("formId"));
		File  downloadFile = downloadService.downloadForm(request,session);
		try{
	        FileInputStream inputStream = new FileInputStream(downloadFile);	         
	        ServletContext context = request.getServletContext();
	        // get MIME type of the file
	        String mimeType = context.getMimeType(downloadFile.getAbsolutePath());
	        if (mimeType == null) {
	            // set to binary type if MIME mapping not found
	            mimeType = "application/octet-stream";
	        }
	        System.out.println("MIME type: " + mimeType);
	        System.out.println(" file path "+downloadFile);
	        // set content attributes for the response
	        response.setContentType("application/octet-stream");
	        response.setContentLength((int) downloadFile.length());
	 
	        // set headers for the response
	        String headerKey = "Content-Disposition";
	        String headerValue = String.format("attachment; filename=\"%s\"",
	                downloadFile.getName());
	        response.setHeader(headerKey, headerValue); 
	      
	        // get output stream of the response
	        OutputStream outStream = response.getOutputStream();
	       // outStream.flush();	 
	        byte[] buffer = new byte[BUFFER_SIZE];
	        int bytesRead = -1;	 
	        
	        // write bytes read from the input stream into the output stream
	        while ((bytesRead = inputStream.read(buffer)) != -1) {
	            outStream.write(buffer, 0, bytesRead);
	        }	 
	        inputStream.close();
	        outStream.close();
	       }catch(Exception e){
	    	   e.printStackTrace();
	       }
	}
	
	public DownloadService getDownloadService() {
		return downloadService;
	}
	public void setDownloadService(DownloadService downloadService) {
		this.downloadService = downloadService;
	}
}
