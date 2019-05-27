package service;

import java.sql.SQLException;

import dao.UserDao;
import domain.User;

public class UserService {

	public boolean register(User user) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		int rows = 0;
		try {
			rows = dao.register(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows > 0 ? true : false;
	}

	public User login(User user) {
		UserDao dao = new UserDao();
		User u=null;
		try {
			u = dao.findUser(user.getUsername(),user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

}
