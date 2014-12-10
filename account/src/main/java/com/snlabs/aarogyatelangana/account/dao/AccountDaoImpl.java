/**
 * 
 */
package com.snlabs.aarogyatelangana.account.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.beans.UserDetailsRowMapper;

/**
 * @author nbattula
 * 
 */
public class AccountDaoImpl implements AccountDao {

	private DataSource dataSource;

	public AccountDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean createAccount(NewUser user) {

		String query = "INSERT INTO T_USER_DETAILS (F_LOGIN_ID, F_PASSWORD, F_DISPLAY_NAME, F_ROLE) VALUES (?,?,?,?)";

		Object[] args = new Object[] { user.getLoginId(), user.getPassword(),
				user.getDisplayName(), user.getUserRole() };

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		int out = jdbcTemplate.update(query, args);

		if (out != 0) {
			System.out.println("Account saved with id=" + user.getLoginId());
			return true;
		} else {
			System.out.println("Account save failed with id="
					+ user.getLoginId());
			return false;
		}
	}

	@Override
	public UserDetails getAccountDetails(LoginUser user) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("Data Source:"+dataSource);
		String query = "SELECT F_LOGIN_ID, F_MOBILE_NUMBER, F_DISPLAY_NAME, F_ROLE FROM T_USER_DETAILS WHERE TRIM(F_LOGIN_ID) = ? AND TRIM(F_PASSWORD) = ?";
		System.out.println("Data Source "+dataSource);
		Object[] args = new Object[] { user.getUserName(), user.getPassword() };
		try {
			@SuppressWarnings("unchecked")
			UserDetails userDetails = (UserDetails)jdbcTemplate.queryForObject(query, args, new UserDetailsRowMapper());
			return userDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
