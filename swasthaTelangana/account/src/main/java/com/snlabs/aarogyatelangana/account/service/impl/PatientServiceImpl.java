package com.snlabs.aarogyatelangana.account.service.impl;

import java.util.HashMap;
import java.util.Random;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.dao.PatientDao;
import com.snlabs.aarogyatelangana.account.service.PatientService;

public class PatientServiceImpl implements PatientService {

	PatientDao patientDao;
	
	public static HashMap<String,String> patientSessionMap = new HashMap<String,String>();

	@Override
	public int createPatientRecord(Patient patient) {
      String patientId  = null;
      String formId = null;
		try{
		  patientId = String.valueOf((new Random().nextInt(9999-1000)+1000));
		  formId = String.valueOf((new Random().nextInt(9999-1000)+1000)+1);
		  patient.setPatientId(patientId);
		  patient.setFormId(formId);
		}catch(Exception e){
			e.printStackTrace();
		}
		return patientDao.save(patient);
	}

	public PatientDao getPatientDao() {
		return patientDao;
	}

	public void setPatientDao(PatientDao patientDao) {
		this.patientDao = patientDao;
	}

	@Override
	public Patient searchPatientById(int patientId) {
		return patientDao.searchPatientById(patientId);
	}

	@Override
	public Patient searchPatientByName(String patientName) {
		return patientDao.searchPatientByName(patientName);
	}

	public static HashMap<String, String> getPatientSessionMap() {
		return patientSessionMap;
	}

	public static void setPatientSessionMap(
			HashMap<String, String> patientSessionMap) {
		PatientServiceImpl.patientSessionMap = patientSessionMap;
	}

}
