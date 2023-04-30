package Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.Db;
import Model.Arf;

public class Arf_Service_empl implements Arf_Service {

	@Override
	public boolean Report(Arf ar) {
		
		String Report_ins = "insert into report(rfname,remail,rquery) values(?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(Report_ins);
			
			pstm.setString(1,ar.getRfname());
			pstm.setString(2,ar.getRemail());
			pstm.setString(3,ar.getRquery());
			
			pstm.execute();
			return true;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Feedback(Arf af) {
		
		String feed_ins = "insert into feedback(femail,fquery) values(?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(feed_ins);
			
			pstm.setString(1, af.getFemail());
			pstm.setString(2, af.getFquery());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
