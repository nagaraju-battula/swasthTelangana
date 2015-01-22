package com.snlabs.aarogyatelangana.account.dao.impl;

import com.snlabs.aarogyatelangana.account.beans.Patient;
import com.snlabs.aarogyatelangana.account.beans.PatientAddress;
import com.snlabs.aarogyatelangana.account.beans.User;
import com.snlabs.aarogyatelangana.account.dao.PatientDao;
import com.snlabs.aarogyatelangana.account.service.impl.PatientProfileMapper;
import com.snlabs.aarogyatelangana.account.service.impl.PatientRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PatientDaoImpl implements PatientDao {

    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Patient save(Patient patient) {
        String insertPatientQuery = "INSERT INTO T_PATIENT("
                + "F_PATIENT_NAME," + "F_PATIENT_ID," + "F_AGE," + "F_GENDER,"
                + "F_CREATED_BY," + "F_CREATED_TIMESTAMP," + "F_AADHAR_NO" + ") "
                + "VALUES(?,?,?,?,?,SYSDATE(),?)";
        Object[] args = {patient.getPatientName(), patient.getPatientId(),
                patient.getAge(), patient.getGender(), patient.getCreatedBy(), patient.getAadharNo()};
        try {
            if (jdbcTemplate.update(insertPatientQuery, args) > 0) {
                return savePatientAddress(patient.getPatientId(), patient.getPatientAddress()) > 0 ? patient : null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private int savePatientAddress(int patientID, PatientAddress patientAddress) {
        String insertPatientAddress = "INSERT INTO T_PATIENT_ADDRESS("
                + "F_PATIENT_ID," + "F_ADDRESS," + "F_CONTACT_NO,"
                + "F_DISTRICT," + "F_STATE," + "F_PINCODE," + "F_CURRENT_ADDRESS" + ") " + "VALUES"
                + "(?,?,?,?,?,?,?)";
        Object[] args = {patientID, patientAddress.getAddress().trim(),
                patientAddress.getContactno(), patientAddress.getDistrict(),
                patientAddress.getState(), patientAddress.getPincode(), patientAddress.getCurrentAddress().trim()};
        return jdbcTemplate.update(insertPatientAddress, args);
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
        String patientRecord = "SELECT * FROM T_PATIENT WHERE F_PATIENT_ID = ?";
        Object[] args = {patient.getPatientId()};
        try {
            final Patient record = new Patient();
            jdbcTemplate.update(patientRecord, args, new RowMapper() {
                @Override
                public Patient mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
                    record.setPatientName(resultSet.getString("F_PATIENT_NAME"));
                    record.setPatientId(resultSet.getInt("F_PATIENT_ID"));
                    record.setCreatedTimestamp(resultSet.getDate("F_CREATED_TIMESTAMP"));
                    record.setAge(resultSet.getInt("F_AGE"));
                    record.setGender(resultSet.getString("F_GENDER"));
                    record.setCreatedBy(resultSet.getString("F_CREATED_BY"));
                    record.setFormFDownloadPath(resultSet.getString("F_DOWNLOAD_PATH"));
                    record.setAadharNo(resultSet.getString("F_AADHAR_NO"));
                    return record;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            List<User> detailsList = (List<User>) jdbcTemplate.queryForObject(sb.toString(),
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
            List<User> detailsList = (List<User>) jdbcTemplate.queryForObject(sb.toString(),
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
            detailsList = (List<Patient>) jdbcTemplate.queryForObject(sb.toString(),
                    new PatientProfileMapper());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detailsList;
    }

}
