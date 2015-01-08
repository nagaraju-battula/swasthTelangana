package com.snlabs.aarogyatelangana.account.dao.impl;

import com.snlabs.aarogyatelangana.account.beans.*;
import com.snlabs.aarogyatelangana.account.dao.FormDao;
import com.snlabs.aarogyatelangana.account.service.impl.FormRowMapper;
import com.snlabs.aarogyatelangana.account.service.impl.PatientIDsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class FormDaoImpl implements FormDao {

	private DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Form form) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO T_CLINIC_DETAILS(").append(
				"F_PATIENT_ID," + "F_CLINIC_OWNER_NAME," + "F_TYPE,"
						+ "F_ADDRESS," + "F_DISTRICT," + "F_STATE,"
						+ "F_PINCODE," + "F_CONTACT_NO," + "F_CLINIC_NAME)");
		sb.append("VALUES(?,?,?,?,?,?,?,?,?)");
		ClinicAddress clinicAddress = form.getClinicAddress();
		Object[] args = new Object[] { form.getPatient().getPatientId(),
				clinicAddress.getOwnerName(), clinicAddress.getType(),
				clinicAddress.getAddress(), clinicAddress.getDistrict(),
				clinicAddress.getState(), clinicAddress.getPincode(),
				clinicAddress.getContactNum(), clinicAddress.getClinicName() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	private int updatePatientRecord(Form form) {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE T_PATIENT SET ").append("F_FORM_ID = ?");
		sb.append(" WHERE F_PATIENT_ID=?");
		Object[] args = new Object[] { form.getFormID(),
				form.getPatient().getPatientId() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
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
		Form form = null;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM T_FORM WHERE F_FORM_ID=").append(formId);
		try {
			/*
			 * List<User> detailsList =
			 * jdbcTemplate.queryForObject(sb.toString(), new FormRowMapper());
			 * for (User user : detailsList) { if (user instanceof Form) { form
			 * = (Form) user; } }
			 */
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
		Form form = null;
		// Date format should be YYYY-MONTH-DATE
		StringBuilder sb = new StringBuilder();
		sb.append(
				"SELECT F_PATIENT_ID FROM T_PATIENT WHERE F_CREATED_TIMESTAMP BETWEEN ")
				.append("STR_TO_DATE('").append(fromDate)
				.append("','%Y-%m-%d') AND STR_TO_DATE('").append(toDate)
				.append("','%Y-%m-%d')");
		try {
			List<Integer> patientIDs = (List<Integer>)jdbcTemplate.queryForObject(
					sb.toString(), new PatientIDsMapper());
			if (patientIDs.size() > 0) {
				StringBuilder getResult = new StringBuilder();
				getResult.append("SELECT PATIENT.F_PATIENT_NAME,"
						+ "PATIENT.F_PATIENT_ID," + "PATIENT.F_AGE,"
						+ "patient.F_GENDER," + "FORMF.F_NO_OF_CHILDREN");
				getResult
						.append(" FROM T_FORM FORMF,T_PATIENT PATIENT WHERE patient.f_patient_id = formf.f_patient_id AND "
								+ "patient.f_patient_id>="
								+ patientIDs.get(0)
								+ " AND patient.f_patient_id<="
								+ patientIDs.get(patientIDs.size() - 1));
				List<User> formBeans = (List<User>)jdbcTemplate.queryForObject(
						getResult.toString(), new FormRowMapper());
				form = new Form();
				form.setFormbeans(formBeans);
				return form;

			} else {
				form.setFormbeans(null);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return form;
	}

	@Override
	public int saveSectionA(SectionA section) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO T_FORM(").append(
				"F_PATIENT_ID," + "F_NO_OF_CHILDREN," + "F_NO_OF_MALE_KIDS,"
						+ "F_NO_OF_FEMALE_KIDS," + "F_GUARDIAN_NAME,"
						+ "F_MENSTRUAL_PERIOD)");
		sb.append("VALUES(?,?,?,?,?,?)");
		System.out.println(" section Patient ID" + section.getPatientID());
		Object[] args = new Object[] { section.getPatientID(),
				section.getNoOfChildren(), section.getNoOfMaleKids(),
				section.getNoOfFemaleKids(), section.getGuardianName(),
				section.getMenstrualPeriod() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int saveNonInvasive(NonInvasive nonInvasive) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO T_NON_INVASIVE_PROCEDURES(")
				.append("F_DOCTOR_NAME," + "F_DIAGNOSIS_INDICATION,"
						+ "F_CARRIED_NON_INVASIVE_PROCEDURE,"
						+ "F_DECLARATION_DATE," + "F_PROCEDURE_CARRIED_DATE,"
						+ "F_PROCEDURE_RESULT," + "F_MTP_INDICATION,"
						+ "F_SELECTED_DIAGNOSE")
				.append(")VALUES(?,?,?,?,?,?,?,?)");
		Object[] args = new Object[] { nonInvasive.getDoctorName(),
				nonInvasive.getDiagnosisIndication(),
				nonInvasive.getCarriedNonInvasiveProcedure(),
				nonInvasive.getDeclarationDate(),
				nonInvasive.getProcedureCarriedDate(),
				nonInvasive.getProcedureResult(),
				nonInvasive.getMtpIndication(),
				nonInvasive.getSelectedDiagnoseDetails() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int saveInvasive(Invasive invasive) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO T_INVASIVE_PROCEDURES(")
				.append("F_PATIENT_ID,F_DOCTOR_NAME," + "F_DIAGNOSIS_BASICS,"
						+ "F_ADVANCED_MATERNAL_AGE," + "F_GENETIC_DISEASE,"
						+ "F_CONTEST_DATE," + "F_CARRIED_INVASIVE_PROCEDURE,"
						+ "F_COMPILICATION," + "F_ADDITIONAL_TEST,"
						+ "F_PROCEDURE_RESULT," + "F_PROCEDURE_CARRIED_DATE,"
						+ "F_MTP_INDICATION")
				.append(")VALUES(?,?,?,?,?,SYSDATE(),?,?,?,?,SYSDATE(),?)");
		Object[] args = new Object[] { invasive.getPatientID(),
				invasive.getDoctorName(), invasive.getDignosisBasics(),
				invasive.getAdvancedMaternalAge(),
				invasive.getGeneticDisease(),
				invasive.getCarriedInvasiveProcedure(),
				invasive.getCompilication(), invasive.getAdditionalTest(),
				invasive.getProcedureResult(), invasive.getMtpIndication() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int saveDeclaration(Declaration declaration) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO T_DOCTOR_DECLARATION(")
				.append("F_PATIENT_ID," + "F_DOCTOR_NAME," + "F_PLACE,"
						+ "F_PATIENT_NAME," + "F_DATE)")
				.append(" VALUES(?,?,?,?,SYSDATE())");
		Object[] args = new Object[] { declaration.getPatientID(),
				declaration.getDoctorName(), declaration.getPlace(),
				declaration.getPatientName() };
		try {
			if (jdbcTemplate.update(sb.toString(), args) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
