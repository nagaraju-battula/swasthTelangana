
package com.snlabs.aarogyatelangana.account.dao;
import com.snlabs.aarogyatelangana.account.beans.LoginUser;
import com.snlabs.aarogyatelangana.account.beans.NewUser;
import com.snlabs.aarogyatelangana.account.beans.UserDetails;
import com.snlabs.aarogyatelangana.account.beans.UserDetailsRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class AccountDaoImpl implements AccountDao {

	private DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

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
		String query = "INSERT INTO t_user_details (F_LOGIN_ID, F_PASSWORD, F_DISPLAY_NAME, F_ROLE) VALUES (?,?,?,?)";
		Object[] args = new Object[] { user.getLoginId(), user.getPassword(),
				user.getDisplayName(), user.getUserRole() };		
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
		String query = "SELECT F_LOGIN_ID, F_MOBILE_NUMBER, F_DISPLAY_NAME, F_ROLE FROM t_user_details WHERE TRIM(F_LOGIN_ID) = ? AND TRIM(F_PASSWORD) = ?";
		Object[] args = new Object[] { user.getUserName(), user.getPassword() };		
		try {
			@SuppressWarnings("unchecked")
			UserDetails userDetails = (UserDetails) jdbcTemplate
					.queryForObject(query, args, new UserDetailsRowMapper());			
			return userDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
