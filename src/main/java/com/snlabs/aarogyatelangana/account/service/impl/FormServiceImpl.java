package com.snlabs.aarogyatelangana.account.service.impl;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.dao.FormDao;
import com.snlabs.aarogyatelangana.account.service.FormService;
import com.snlabs.aarogyatelangana.account.service.PatientService;

public class FormServiceImpl implements FormService {

	FormDao formDao;
	
	PatientService patientService;
	
	
	@Override
	public int createForm(Form form) {
		//get the FormId for this patient before inserting the form Data to T_FORM Table 
		try{
			Patient patientRecord = patientService.searchPatientByName(form.getPatientName());
			if(patientRecord != null && patientRecord.getFormId() != null){
				form.setFormID(Integer.parseInt(patientRecord.getFormId()));
			}else{
				System.out.println(" Failed to get the Patient Record for the Given Patient Name");
			}
		   return formDao.save(form);
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	public FormDao getFormDao() {
		return formDao;
	}
	public void setFormDao(FormDao formDao) {
		this.formDao = formDao;
	}
	@Override
	public Form searchForm(int formId) {
		return formDao.findByFormId(formId);
		
	}
	
	public PatientService getPatientService() {
		return patientService;
	}
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
	@Override
	public Form searchFormByDateRange(String fromDate, String toDate) {
		
		return formDao.searchFormByDateRange(fromDate, toDate);
	}
	

}
