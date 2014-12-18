package com.snlabs.aarogyatelangana.account.dao.impl;

import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.PatientAddress;
import com.snlabs.aarogyatelangana.account.beans.User;
import com.snlabs.aarogyatelangana.account.dao.PatientDao;
import com.snlabs.aarogyatelangana.account.service.impl.PatientRowMapper;

public class PatientDaoImpl implements PatientDao {

	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Patient patient) {
		String insertPatientQuery = "Insert into t_patient("
				+ "F_PATIENT_NAME," + "F_PATIENT_ID," + "F_AGE," + "F_GENDER,"
				+ "F_CREATED_TIMESTAMP" + ") " + "VALUES"
				+ "(?,?,?,?,SYSDATE())";
		Object[] args = { patient.getPatientName(), patient.getPatientId(),
				patient.getAge(), patient.getGender() };
		// JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			if (jdbcTemplate.update(insertPatientQuery, args) > 0) {
				savePatientAddress(patient.getPatientAddress());
				return patient.getPatientId();
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int savePatientAddress(PatientAddress patientAddress) {
		String insertPatientAddress = "Insert into t_patient_address("
				+ "F_ADDRESS_ID," + "F_ADDRESS," + "F_CONTACT_NO,"
				+ "F_DISTRICT," + "F_STATE," + "F_PINCODE" + ") " + "VALUES"
				+ "(?,?,?,?,?,?)";
		patientAddress
				.setPatientAddressID(new Random().nextInt(9999 - 1000) + 2000);
		Object[] args = { patientAddress.getPatientAddressID(),
				patientAddress.getAddress().trim(),
				patientAddress.getContactno(), patientAddress.getDistrict(),
				patientAddress.getState(), patientAddress.getPincode() };
		try {
			if (jdbcTemplate.update(insertPatientAddress, args) > 0) {
				return patientAddress.getPatientAddressID();
			} else {
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
		Patient patient = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM t_patient WHERE F_PATIENT_ID=").append(
				patientId);
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			List<User> detailsList = template.queryForObject(sb.toString(),
					new PatientRowMapper());
			for (User user : detailsList) {
				if (user instanceof Patient) {
					patient = (Patient) user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
	}

	@Override
	public Patient searchPatientByName(String patientName) {
		Patient patient = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM t_patient WHERE F_PATIENT_NAME='")
				.append(patientName).append("'");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			List<User> detailsList = template.queryForObject(sb.toString(),
					new PatientRowMapper());
			for (User user : detailsList) {
				if (user instanceof Patient) {
					patient = (Patient) user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
	}

}
