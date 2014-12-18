package com.snlabs.aarogyatelangana.account.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.User;
import com.snlabs.aarogyatelangana.account.dao.PatientDao;
import com.snlabs.aarogyatelangana.account.utils.PatientRowMapper;

public class PatientDaoImpl implements PatientDao {

	private DataSource dataSource;
	
	@Override
	public int save(Patient patient) {
		String insertPatientQuery = "INSERT INTO DEMO.T_PATIENT(F_PATIENT_ID,F_FORM_ID,F_PATIENT_NAME,"
				+ "F_PATIENT_ADDRESS,"
				+ "F_PRICE,"
				+ "F_DISCOUNT,"
				+ "F_NETAMOUNT, F_CREATED_TIMESTAMP) " + "VALUES" + "(?,?,?,?,?,?,?, SYSDATE())";
		Object[] args = { patient.getPatientId(),patient.getFormId(),patient.getPatientName(),
				patient.getPatientAddress(), patient.getPrice(),
				patient.getDiscount(), patient.getNetAmount() };
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			if(template.update(insertPatientQuery, args)>0){
				return Integer.parseInt(patient.getPatientId());
			}else{
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean update(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient findByPatientName(String patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient findByPatientId(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Patient searchPatientById(int patientId) {
		Patient patient  = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM DEMO.t_patient WHERE F_PATIENT_ID=").append(patientId);
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			@SuppressWarnings("unchecked")
			List<User> detailsList = template.queryForObject(sb.toString(), new PatientRowMapper());
			for(User user:detailsList){
				if(user instanceof Patient){
					patient = (Patient)user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
	}

	@Override
	public Patient searchPatientByName(String patientName) {
		Patient patient  = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM DEMO.t_patient WHERE F_PATIENT_NAME='").append(patientName).append("'");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			@SuppressWarnings("unchecked")
			List<User> detailsList   = template.queryForObject(sb.toString(), new PatientRowMapper());
			for(User user:detailsList){
				if(user instanceof Patient){
					patient = (Patient)user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
	}

}
