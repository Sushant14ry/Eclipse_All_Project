package SpringCoreJDBC.SpringCoreJDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import SpringCoreJDBC.SpringCoreJDBC.Entities.Student;

public class RowMapper_empl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// 
		Student students = new Student();
		students.setId(rs.getInt(1));
		students.setName(rs.getString(2));
		students.setCity(rs.getString(3));
		
		return students;
	}
}
