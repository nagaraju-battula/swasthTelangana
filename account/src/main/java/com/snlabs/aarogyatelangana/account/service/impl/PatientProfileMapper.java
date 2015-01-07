package com.snlabs.aarogyatelangana.account.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.User;

public class PatientProfileMapper implements RowMapper {
	Patient patient = null;
	List<Patient> patientProfiles = new ArrayList<Patient>();

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		do {
			patient = new Patient();
			patient.setPatientId(rs.getInt("F_PATIENT_ID"));
			patient.setPatientName(rs.getString("F_PATIENT_NAME"));
			patient.setCreatedTimestamp(rs.getDate("F_CREATED_TIMESTAMP"));
			patient.setFormFDownloadPath(rs.getString("F_DOWNLOAD_PATH"));
			patientProfiles.add(patient);
		} while (rs.next());
		return patientProfiles;
	}
}
