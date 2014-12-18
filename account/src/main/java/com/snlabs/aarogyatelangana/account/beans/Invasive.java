package com.snlabs.aarogyatelangana.account.beans;

import java.util.Date;

public class Invasive {

	private int invasiveID;
	private String doctorName;
	private String dignosisBasics;
	private String advancedMaternalAge;
	private String geneticDisease;
	private Date contestDate;
	private String carriedInvasiveProcedure;
	private String compilication;
	private String additionalTest;
	private String procedureResult;
	private Date procedureCarriedDate;
	private String mtpIndication;

	public int getInvasiveID() {
		return invasiveID;
	}

	public void setInvasiveID(int invasiveID) {
		this.invasiveID = invasiveID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDignosisBasics() {
		return dignosisBasics;
	}

	public void setDignosisBasics(String dignosisBasics) {
		this.dignosisBasics = dignosisBasics;
	}

	public String getAdvancedMaternalAge() {
		return advancedMaternalAge;
	}

	public void setAdvancedMaternalAge(String advancedMaternalAge) {
		this.advancedMaternalAge = advancedMaternalAge;
	}

	public String getGeneticDisease() {
		return geneticDisease;
	}

	public void setGeneticDisease(String geneticDisease) {
		this.geneticDisease = geneticDisease;
	}

	public Date getContestDate() {
		return contestDate;
	}

	public void setContestDate(Date contestDate) {
		this.contestDate = contestDate;
	}

	public String getCarriedInvasiveProcedure() {
		return carriedInvasiveProcedure;
	}

	public void setCarriedInvasiveProcedure(String carriedInvasiveProcedure) {
		this.carriedInvasiveProcedure = carriedInvasiveProcedure;
	}

	public String getCompilication() {
		return compilication;
	}

	public void setCompilication(String compilication) {
		this.compilication = compilication;
	}

	public String getAdditionalTest() {
		return additionalTest;
	}

	public void setAdditionalTest(String additionalTest) {
		this.additionalTest = additionalTest;
	}

	public String getProcedureResult() {
		return procedureResult;
	}

	public void setProcedureResult(String procedureResult) {
		this.procedureResult = procedureResult;
	}

	public Date getProcedureCarriedDate() {
		return procedureCarriedDate;
	}

	public void setProcedureCarriedDate(Date procedureCarriedDate) {
		this.procedureCarriedDate = procedureCarriedDate;
	}

	public String getMtpIndication() {
		return mtpIndication;
	}

	public void setMtpIndication(String mtpIndication) {
		this.mtpIndication = mtpIndication;
	}

	@Override
	public String toString() {
		return "Invasive [invasiveID=" + invasiveID + ", doctorName="
				+ doctorName + ", dignosisBasics=" + dignosisBasics
				+ ", advancedMaternalAge=" + advancedMaternalAge
				+ ", geneticDisease=" + geneticDisease + ", contestDate="
				+ contestDate + ", carriedInvasiveProcedure="
				+ carriedInvasiveProcedure + ", compilication=" + compilication
				+ ", additionalTest=" + additionalTest + ", procedureResult="
				+ procedureResult + ", procedureCarriedDate="
				+ procedureCarriedDate + ", mtpIndication=" + mtpIndication
				+ "]";
	}
}
