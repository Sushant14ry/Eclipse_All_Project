package SpringCoreJDBC.SpringCoreJDBC.Dao;

import java.util.List;

import SpringCoreJDBC.SpringCoreJDBC.Entities.Student;

public interface StudentDao {
	public int insert(Student studentt);
	public int update(Student studentt);
	public int delete(int studentt_id);
	public Student getStudent(int StudentId);
	
	public List<Student> getAllStudents();
}
