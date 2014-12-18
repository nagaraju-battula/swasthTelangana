package com.snlabs.aarogyatelangana.account.beans;

import java.util.ArrayList;
import java.util.List;

public class Form extends User{

	int formID;
	public String patientName;
	public int age;
	public int noOfChildren;
	public String guardianName;
	public String patientAddress;
	public String referralAddress;
	public int menstrualPeriod;
	public String medicalDisease;
	public String parentalDiagnosis;
	public String gynecologistDetails;	
	public String toDate;	
	public String fromDate;	
	public List<User> formbeans = new ArrayList<User>();
	
	public String searchFormId;

	public String getSearchFormId() {
		return searchFormId;
	}

	public void setSearchFormId(String searchFormId) {
		this.searchFormId = searchFormId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getReferralAddress() {
		return referralAddress;
	}

	public void setReferralAddress(String referralAddress) {
		this.referralAddress = referralAddress;
	}

	public int getMenstrualPeriod() {
		return menstrualPeriod;
	}

	public void setMenstrualPeriod(int menstrualPeriod) {
		this.menstrualPeriod = menstrualPeriod;
	}

	public String getMedicalDisease() {
		return medicalDisease;
	}

	public void setMedicalDisease(String medicalDisease) {
		this.medicalDisease = medicalDisease;
	}

	public String getParentalDiagnosis() {
		return parentalDiagnosis;
	}

	public void setParentalDiagnosis(String parentalDiagnosis) {
		this.parentalDiagnosis = parentalDiagnosis;
	}

	public String getGynecologistDetails() {
		return gynecologistDetails;
	}

	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public void setGynecologistDetails(String gynecologistDetails) {
		this.gynecologistDetails = gynecologistDetails;
	}
	
	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public List<User> getFormbeans() {
		return formbeans;
	}

	public void setFormbeans(List<User> formbeans) {
		this.formbeans = formbeans;
	}

	@Override
	public String toString() {
		return "Form [formID=" + formID + ", patientName=" + patientName
				+ ", age=" + age + ", noOfChildren=" + noOfChildren
				+ ", guardianName=" + guardianName + ", patientAddress="
				+ patientAddress + ", referralAddress=" + referralAddress
				+ ", menstrualPeriod=" + menstrualPeriod + ", medicalDisease="
				+ medicalDisease + ", parentalDiagnosis=" + parentalDiagnosis
				+ ", gynecologistDetails=" + gynecologistDetails + ", toDate="
				+ toDate + ", fromDate=" + fromDate + ", searchFormId="
				+ searchFormId + "]";
	}

}
