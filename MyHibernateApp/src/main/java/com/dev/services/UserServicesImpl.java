    
package com.dev.services;

import com.dev.beans.User;
import com.dev.dao.JPAImpl;
import com.dev.dao.UserDAO;

public class UserServicesImpl implements UserServices {

	private UserDAO db = new JPAImpl();

	public Boolean createProfile(User user) {
		return db.createProfile(user);
	}

	public User getUser(Integer userId) {
		return db.getUser(userId);
	}

	public User removeUser(Integer userId) {
		return db.removeUser(userId);
	}

	public Boolean updatePassword(Integer userId, String passwd) {
		return db.updatePassword(userId, passwd);
	}
	
}