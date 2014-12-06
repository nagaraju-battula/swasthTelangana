/**
 * 
 */
package com.snlabs.aarogyatelangana.account.beans;

/**
 * @author nbattula
 *
 */
public class UserDetails {

	public String loginId;
	public String displayName;
	public String userRole;
	public String lastlogin;
	public String mobileNumber;
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "UserDetails [loginId=" + loginId + ", displayName="
				+ displayName + ", userRole=" + userRole + ", lastlogin="
				+ lastlogin + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
