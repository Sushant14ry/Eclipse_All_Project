package service;

import java.util.List;

import model.SingUp;

public interface Market_User_Service {
	
	boolean AddUser(SingUp sup);
	boolean DelUser(int id);
	boolean UpdUser(SingUp sup);
	
	SingUp getUserId(String id);
	
	List<SingUp> getAllUser();
	List<SingUp> SearchUser(String S_user);
}
