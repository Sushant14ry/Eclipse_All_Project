package SpringCoreJDBC.SpringCoreJDBC.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import SpringCoreJDBC.SpringCoreJDBC.Entities.Student;
@Component("Student_Dao")
public class StudentdDao_empl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student studentt) {
	      // Insert Operation
	      String insert = "insert into student(id,name,city) values(?,?,?) ";
	      int res = this.jdbcTemplate.update(insert,studentt.getId(),studentt.getName(),studentt.getCity());
		return res;
	}

	public int update(Student studentt) {
		// updating Operation
		String update = "update student set name=? , city=? where id=? ";
		int res2 = this.jdbcTemplate.update(update,studentt.getName(),studentt.getCity(),studentt.getId());
		return res2;
	}

	public int delete(int studentt_id) {
		// Delete Operation
		String delete = "delete from student where id=? ";
		int res3 = this.jdbcTemplate.update(delete,studentt_id);
		return res3;
	}

	public Student getStudent(int StudentId) {
		// Fetch And Show all Data From Database
		
		String ShowSingle = "select * from student where id=? ";
		RowMapper<Student> rowMapper = new RowMapper_empl();
		Student studentob = this.jdbcTemplate.queryForObject(ShowSingle,rowMapper,StudentId);
		
		return studentob;
	}

	public List<Student> getAllStudents() {
		// Selecting Multiple Students
		
		String showAll = "select * from student"; 
		List<Student> all_Students = this.jdbcTemplate.query(showAll, new RowMapper_empl());
		return all_Students;
	}


	
}
