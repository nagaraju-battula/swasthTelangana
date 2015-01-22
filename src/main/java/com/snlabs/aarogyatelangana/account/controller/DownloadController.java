package com.snlabs.aarogyatelangana.account.controller;

import com.snlabs.aarogyatelangana.account.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@Controller
public class DownloadController {

	@Autowired
	DownloadService downloadService;

	private static final int BUFFER_SIZE = 4096;

	@RequestMapping(value = { "downLoadFile.action" })
	public void downloadFile(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, ModelMap map, File file) {
		try {
			FileInputStream inputStream = new FileInputStream(file);
			ServletContext context = request.getServletContext();
			String mimeType = context.getMimeType(file.getAbsolutePath());
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType("application/octet-stream");
			response.setContentLength((int) file.length());
			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"",
					file.getName());
			response.setHeader(headerKey, headerValue);
			OutputStream outStream = response.getOutputStream();
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}
			inputStream.close();
			outStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = { "downLoadForm.action" })
	public void downLoadReport(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, ModelMap map) {
		//File downloadFile = downloadService.downloadForm(request, session);
		//downloadFile(downloadFile);
	}

	public DownloadService getDownloadService() {
		return downloadService;
	}

	public void setDownloadService(DownloadService downloadService) {
		this.downloadService = downloadService;
	}
}
