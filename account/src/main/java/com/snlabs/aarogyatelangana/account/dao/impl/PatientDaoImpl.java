package com.snlabs.aarogyatelangana.account.dao.impl;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.PatientAddress;
import com.snlabs.aarogyatelangana.account.beans.User;
import com.snlabs.aarogyatelangana.account.dao.PatientDao;
import com.snlabs.aarogyatelangana.account.service.impl.PatientProfileMapper;
import com.snlabs.aarogyatelangana.account.service.impl.PatientRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PatientDaoImpl implements PatientDao {

	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Patient patient) {
		String insertPatientQuery = "INSERT INTO T_PATIENT("
				+ "F_PATIENT_NAME," + "F_PATIENT_ID," + "F_AGE," + "F_GENDER,"
				+ "F_CREATED_BY," + "F_CREATED_TIMESTAMP " + ") "
				+ "VALUES(?,?,?,?,?,SYSDATE())";
		Object[] args = { patient.getPatientName(), patient.getPatientId(),
				patient.getAge(), patient.getGender(), patient.getCreatedBy() };
		try {
			if (jdbcTemplate.update(insertPatientQuery, args) > 0) {
				savePatientAddress(patient.getPatientId(),
						patient.getPatientAddress());
				return patient.getPatientId();
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int savePatientAddress(int patientID, PatientAddress patientAddress) {
		String insertPatientAddress = "INSERT INTO T_PATIENT_ADDRESS("
				+ "F_PATIENT_ID," + "F_ADDRESS," + "F_CONTACT_NO,"
				+ "F_DISTRICT," + "F_STATE," + "F_PINCODE" + ") " + "VALUES"
				+ "(?,?,?,?,?,?)";
		Object[] args = { patientID, patientAddress.getAddress().trim(),
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
		sb.append("SELECT * FROM T_PATIENT WHERE F_PATIENT_ID=").append(
				patientId);
		try {
			List<User> detailsList = (List<User>)jdbcTemplate.queryForObject(sb.toString(),
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
		sb.append("SELECT * FROM T_PATIENT WHERE F_PATIENT_NAME='")
				.append(patientName).append("'");
		try {
			List<User> detailsList = (List<User>)jdbcTemplate.queryForObject(sb.toString(),
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
	public List<Patient> searchPatientProfilesByCreator(String createdBy) {
		StringBuilder sb = new StringBuilder();
		List<Patient> detailsList = null;
		sb.append(
				"SELECT F_PATIENT_ID," + "F_PATIENT_NAME,"
						+ "F_CREATED_TIMESTAMP," + "F_DOWNLOAD_PATH"
						+ " FROM T_PATIENT WHERE F_CREATED_BY='")
				.append(createdBy).append("'");
		try {
			detailsList = (List<Patient>)jdbcTemplate.queryForObject(sb.toString(),
					new PatientProfileMapper());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detailsList;
	}

}
