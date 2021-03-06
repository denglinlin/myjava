package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.User;
import utils.DataSourceUtils;

public class UserDao {

	public int register(User user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(?,?,?,?,?,?,?,?,?,?,?)";
		int rows=runner.update(sql,user.getId(),user.getUsername(),
				user.getPassword(),user.getPhone(),null,user.getSex(),
				null,null,null,null,0);
		return rows;
	}

	public User findUser(String username, String password) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where user_name=? and user_password=?";
		User user = runner.query(sql,new BeanHandler<User>(User.class),username,password);
		return user;
	}

}
