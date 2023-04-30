package Service;

import java.util.List;

import model.Room;

public interface Room_Service {
	boolean AddRoom(Room rm);
	
	boolean UpdRoom(Room rm);
	
	Room getRoomById(int id);
	
	List<Room> getAllRoom();
	
	List<Room> SearchRoom(Room s_room);
}
