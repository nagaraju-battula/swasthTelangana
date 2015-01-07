package com.snlabs.aarogyatelangana.account.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.User;

public class PatientRowMapper implements RowMapper {

	Patient patient = null;
	List<User> detailsList = new ArrayList<User>();

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		do {
			patient = new Patient();
			patient.setPatientName(rs.getString("F_PATIENT_NAME"));
			detailsList.add(patient);
		} while (rs.next());
		return detailsList;
	}
}
