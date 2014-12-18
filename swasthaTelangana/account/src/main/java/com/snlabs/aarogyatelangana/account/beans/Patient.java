package com.snlabs.aarogyatelangana.account.beans;

import java.io.Serializable;


public class Patient extends User implements Serializable{

	/**
	 * Sekhar Karri
	 */
	private static final long serialVersionUID = 1L;
	String patientName;
	String gender;
	String patientAddress;
	String typeOfTest;
	int price;
	int discount;
	int netAmount;
	int contactNo;
	public String patientId;
	public String formId;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
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
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getTypeOfTest() {
		return typeOfTest;
	}
	public void setTypeOfTest(String typeOfTest) {
		this.typeOfTest = typeOfTest;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", gender=" + gender
				+ ", patientAddress=" + patientAddress + ", typeOfTest="
				+ typeOfTest + ", price=" + price + ", discount=" + discount
				+ ", netAmount=" + netAmount + ", contactNo=" + contactNo
				+ ", patientId=" + patientId + "]";
	}
}
