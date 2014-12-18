package com.snlabs.aarogyatelangana.account.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.User;
import com.snlabs.aarogyatelangana.account.dao.FormDao;
import com.snlabs.aarogyatelangana.account.utils.FormRowMapper;

public class FormDaoImpl implements FormDao {

	private DataSource dataSource;

	@Override
	public int save(Form form) {
		// Get the Form Id from patient Table using patient Name
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO DEMO.T_FORM(").append("F_FORM_ID,F_PATIENT_NAME,")
				.append("F_AGE,").append("F_NO_OF_CHILDREN,")
				.append("F_GUARDIAN_NAME,").append("F_PATIENT_ADDRESS,")
				.append("F_REFERRAL_ADDRESS,").append("F_MENSTRUAL_PERIOD,")
				.append("F_MEDICAL_DISEASE,").append("F_PARENTAL_DIAGNOSIS,")
				.append("F_GYNA_DETAILS, F_CREATED_TIMESTAMP");
		sb.append(")VALUES(?,?,?,?,?,?,?,?,?,?,?, sysdate())");
		Object[] args = new Object[] { form.getFormID(),form.getPatientName(), form.getAge(),
				form.getNoOfChildren(), form.getGuardianName(),
				form.getPatientAddress(), form.getReferralAddress(),
				form.getMenstrualPeriod(), form.getMedicalDisease(),
				form.getParentalDiagnosis(), form.getGynecologistDetails()};
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			if(template.update(sb.toString(), args)>0){
				return form.getFormID();
			}else{
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean update(Form form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Form findByFormId(int formId) {
		Form form  = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM DEMO.T_FORM WHERE F_FORM_ID=").append(formId);
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			List<User> detailsList = template.queryForObject(sb.toString(), new FormRowMapper());
			for(User user:detailsList){
				if(user instanceof Form){
					form = (Form)user;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return form;
	}

	@Override
	public boolean delete(Form form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Form findByFromName(String formName) {
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
	public Form searchFormByDateRange(String fromDate, String toDate) {
		Form form  = new Form();
		//Date format should be YYYY-MONTH-DATE
		StringBuilder sb = new StringBuilder();		
		sb.append("SELECT * FROM t_form WHERE F_CREATED_TIMESTAMP BETWEEN ")
			.append("STR_TO_DATE('").append(fromDate).append("','%Y-%m-%d') AND STR_TO_DATE('").append(toDate).append("','%Y-%m-%d')");			
		JdbcTemplate template = new JdbcTemplate(dataSource);
		try {
			List<User> detailsList = template.queryForObject(sb.toString(), new FormRowMapper());
			if(detailsList.size()>0){
				form.setFormbeans(detailsList);
			}else{
				form.setFormbeans(null);
			}
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return form;
	}

}
