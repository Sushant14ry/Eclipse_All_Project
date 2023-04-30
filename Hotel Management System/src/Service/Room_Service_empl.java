package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.Db;
import model.Room;

public class Room_Service_empl implements Room_Service {

	@Override
	public boolean AddRoom(Room rm) {
		
		String AddRoom = "INSERT INTO `room`(`room_num`, `room_type`, `no_bed`, `room_price`) VALUES(?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(AddRoom);
			
			pstm.setString(1, rm.getRoom_no());
			pstm.setString(2, rm.getRoom_type());
			pstm.setString(3, rm.getNo_of_bed());
			pstm.setInt(4, rm.getRoom_price());
			
			pstm.execute();
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean UpdRoom(Room rm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room getRoomById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> getAllRoom() {
		List<Room> r_list = new ArrayList();
		
		String show_all = "SELECT * FROM `room`";
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(show_all);
			
			while(res.next()) {
				Room r = new Room();
				
				r.setRoom_no(res.getString("room_num"));
				r.setRoom_type(res.getString("room_type"));
				r.setNo_of_bed(res.getString("no_bed"));
				r.setRoom_price(res.getInt("room_price"));
				
				r_list.add(r);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r_list;
	}

	@Override
	public List<Room> SearchRoom(Room s_room) {
		// TODO Auto-generated method stub
		return null;
	}

}
