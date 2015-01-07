package com.snlabs.aarogyatelangana.account.dao;

import java.util.List;

import com.snlabs.aarogyatelangana.account.beans.Patient;

public interface PatientDao {
     public int save(Patient patient);
     public boolean update(Patient patient);
     public Patient findByPatientName(String patient);
     public boolean delete(Patient patient);
     public Patient findByPatientId(Patient patient);
	 public Patient searchPatientById(int patientId);
	 public Patient searchPatientByName(String patientName);
	 public List<Patient> searchPatientProfilesByCreator(String createdBY);
}
