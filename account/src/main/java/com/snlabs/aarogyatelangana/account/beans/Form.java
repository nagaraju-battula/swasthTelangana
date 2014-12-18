package com.snlabs.aarogyatelangana.account.beans;

import java.util.ArrayList;
import java.util.List;

/*
 * Section A:To be filled in for all Diagnostic Procedures/Tests
 */
public class Form extends User {

	int formID;
	int clinicID;
	int regID;
	public String patientName;
	public int age;
	public int noOfChildren;
	private int noOfMaleKids;
	private int noOfFemaleKids;
	public String guardianName;
	public String patientAddress;
	private int referralAddressID;
	public int menstrualPeriod;
	public String medicalDisease;
	public String parentalDiagnosis;
	public String gynecologistDetails;
	public String toDate;
	public String fromDate;
	public List<User> formbeans = new ArrayList<User>();
	private ReferralAddress referralAddress;
	private ClinicAddress clinicAddress;
	public static List<String> procedures = new ArrayList<String>();
	private static List<Contact> contacts = new ArrayList<Contact>();
	 
    static {
        contacts.add(new Contact("Barack", "Obama", "barack.o@whitehouse.com", "147-852-965"));
        contacts.add(new Contact("George", "Bush", "george.b@whitehouse.com", "785-985-652"));
        contacts.add(new Contact("Bill", "Clinton", "bill.c@whitehouse.com", "236-587-412"));
        contacts.add(new Contact("Ronald", "Reagan", "ronald.r@whitehouse.com", "369-852-452"));
    }
	static {
		procedures.add("Ultrasound");
		procedures.add("Any other (specify)");
	}

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

	public int getClinicID() {
		return clinicID;
	}

	public void setClinicID(int clinicID) {
		this.clinicID = clinicID;
	}

	public int getRegID() {
		return regID;
	}

	public void setRegID(int regID) {
		this.regID = regID;
	}

	public int getNoOfMaleKids() {
		return noOfMaleKids;
	}

	public void setNoOfMaleKids(int noOfMaleKids) {
		this.noOfMaleKids = noOfMaleKids;
	}

	public int getNoOfFemaleKids() {
		return noOfFemaleKids;
	}

	public void setNoOfFemaleKids(int noOfFemaleKids) {
		this.noOfFemaleKids = noOfFemaleKids;
	}

	public static List<String> getProcedures() {
		return procedures;
	}

	public static void setProcedures(List<String> procedures) {
		Form.procedures = procedures;
	}

	public int getReferralAddressID() {
		return referralAddressID;
	}

	public void setReferralAddressID(int referralAddressID) {
		this.referralAddressID = referralAddressID;
	}

	public void setClinicAddress(ClinicAddress clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	public ClinicAddress getClinicAddress() {
		return clinicAddress;
	}

	public void setReferralAddress(ReferralAddress referralAddress) {
		this.referralAddress = referralAddress;
	}

	@Override
	public String toString() {
		return "Form [formID=" + formID + ", clinicID=" + clinicID + ", regID="
				+ regID + ", patientName=" + patientName + ", age=" + age
				+ ", noOfChildren=" + noOfChildren + ", noOfMaleKids="
				+ noOfMaleKids + ", noOfFemaleKids=" + noOfFemaleKids
				+ ", guardianName=" + guardianName + ", patientAddress="
				+ patientAddress + ", referralAddressID=" + referralAddressID
				+ ", menstrualPeriod=" + menstrualPeriod + ", medicalDisease="
				+ medicalDisease + ", parentalDiagnosis=" + parentalDiagnosis
				+ ", gynecologistDetails=" + gynecologistDetails + ", toDate="
				+ toDate + ", fromDate=" + fromDate + ", formbeans="
				+ formbeans + ", referralAddress=" + referralAddress
				+ ", clinicAddress=" + clinicAddress + ", searchFormId="
				+ searchFormId + "]";
	}

}
