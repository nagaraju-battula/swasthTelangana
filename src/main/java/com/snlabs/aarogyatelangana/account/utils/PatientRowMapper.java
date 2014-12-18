package com.snlabs.aarogyatelangana.account.utils;

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
		do{
			patient= new Patient();			
			patient.setPatientName(rs.getString("F_PATIENT_NAME"));
			patient.setPatientAddress(rs.getString("F_PATIENT_ADDRESS"));
			patient.setPrice(rs.getInt("F_PRICE"));
			patient.setDiscount(rs.getInt("F_DISCOUNT"));
			patient.setNetAmount(rs.getInt("F_NETAMOUNT"));
			patient.setPatientId(rs.getString("F_PATIENT_ID"));		
			patient.setFormId(rs.getString("F_FORM_ID"));	
			detailsList.add(patient);
		}while(rs.next());
		return detailsList;
	}
}
