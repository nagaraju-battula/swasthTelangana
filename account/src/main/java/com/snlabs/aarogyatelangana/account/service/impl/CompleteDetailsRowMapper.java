package com.snlabs.aarogyatelangana.account.service.impl;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompleteDetailsRowMapper implements RowMapper {

	List<User> detailsList = new ArrayList<User>();

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		do {
			Patient pe = new Patient();
			Form form = new Form();
			pe.setPatientName(rs.getString("F_PATIENT_NAME"));
			pe.setPatientId(rs.getInt("F_PATIENT_ID"));
			form.setAge(rs.getInt("F_AGE"));
			form.setPatientAddress(rs.getString("F_ADDRESS"));
			form.setMedicalDisease(rs.getString("F_MEDICAL_DISEASE"));
			form.setParentalDiagnosis(rs.getString("F_PARENTAL_DIAGNOSIS"));
			form.setGynecologistDetails(rs.getString("F_GYNA_DETAILS"));
			detailsList.add(pe);
			detailsList.add(form);
		} while (rs.next());
		return detailsList;
	}
}
