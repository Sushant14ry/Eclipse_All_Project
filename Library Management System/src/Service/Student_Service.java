package Service;

import java.util.List;

import Model.Student;

public interface Student_Service {
	boolean AddStudent(Student std);
	
	boolean DelStudent(int id);
	
	boolean UpdStudent(Student std);
	
	Student getStudentkById(int id);
	
	List<Student> GetAllStudent();
	List<Student> SearchStudent(Student S_student);
}
