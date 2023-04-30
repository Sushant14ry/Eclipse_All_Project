package Service;

import java.util.List;

import model.User;

public interface User_Service {
	boolean LoginUser(String user , String psw);
	
	boolean AddUser(User usr);
	
	boolean DelUser(int id);
	
	boolean UpdUser(User usr);
	
	User GetUserById(String umail);
	
	List<User> getAllUser();
	
	List<User> Search_User(String s_user);
}
