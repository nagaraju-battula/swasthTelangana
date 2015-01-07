/**
 * 
 */
package com.snlabs.aarogyatelangana.account.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author nbattula
 * 
 */
public class UserDetailsRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDetails userDetails = null;
		try {
			userDetails = new UserDetails();
			UserDetails.setLoginId(rs.getString("F_LOGIN_ID"));
			userDetails.setMobileNumber(rs.getString("F_MOBILE_NUMBER"));
			userDetails.setDisplayName(rs.getString("F_DISPLAY_NAME"));
			userDetails.setUserRole(rs.getString("F_ROLE"));
		} catch (Exception e) {
			System.out.println(" Failed login:" + e.getMessage());
		}
		return userDetails;
	}
}