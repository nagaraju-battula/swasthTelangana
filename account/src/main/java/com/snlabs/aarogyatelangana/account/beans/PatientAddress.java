package com.snlabs.aarogyatelangana.account.beans;

public class PatientAddress {
	private int patientID;
	private String address;
	private String district;
	private String state;
	private int pincode;
	private int contactno;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "PatientAddress [patientID=" + patientID + ", address="
				+ address + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + ", contactno=" + contactno + "]";
	}
}
