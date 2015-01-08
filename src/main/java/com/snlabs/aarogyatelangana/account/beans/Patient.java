package com.snlabs.aarogyatelangana.account.beans;

import java.io.Serializable;
import java.util.Date;

public class Patient extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String patientName;
	private int formId;
	private int patientId;
	private Date createdTimestamp;
	private int age;
	private int txnID;
	private String gender;
	private int patientAddressID;
	private PatientAddress patientAddress;
	private String createdBy;
	private String formFDownloadPath;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public int getTxnID() {
		return txnID;
	}

	public void setTxnID(int txnID) {
		this.txnID = txnID;
	}

	public int getPatientAddressID() {
		return patientAddressID;
	}

	public void setPatientAddressID(int patientAddressID) {
		this.patientAddressID = patientAddressID;
	}

	public PatientAddress getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getFormFDownloadPath() {
		return formFDownloadPath;
	}

	public void setFormFDownloadPath(String formFDownloadPath) {
		this.formFDownloadPath = formFDownloadPath;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", formId=" + formId
				+ ", patientId=" + patientId + ", createdTimestamp="
				+ createdTimestamp + ", age=" + age + ", txnID=" + txnID
				+ ", gender=" + gender + ", patientAddressID="
				+ patientAddressID + "]";
	}
}
