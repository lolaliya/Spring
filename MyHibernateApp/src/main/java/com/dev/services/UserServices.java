package com.dev.services;

import com.dev.beans.User;

public interface UserServices {
	public Boolean createProfile(User user);	
	public User getUser(Integer userId);
	public User removeUser(Integer userId);
	public Boolean updatePassword(Integer userId, String passwd);

}