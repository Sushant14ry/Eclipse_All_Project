package com.service;

import java.util.List;

import com.model.User;

public interface User_Service {
	
	void UserSingUp (User usr);
	
	boolean UserLogin(String user, String psw);
	
	List<User> getAlluser();
}
