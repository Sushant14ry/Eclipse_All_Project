package Service;

import java.util.List;

import Model.Member;

public interface Member_Service {
	
	boolean AddMember(Member mbr);
	
	boolean DeleteMembe(int mid);
	
	boolean UpdateMember(Member mid);
	
	Member getMemeberByID(int mid);
	
	List<Member> getAllMember();
	
	List<Member> SearchMember(String s_memeber);
}
