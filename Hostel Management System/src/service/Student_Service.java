package service;

import java.util.List;

import model.Student;

public interface Student_Service {
	boolean AddStudent(Student st);
	boolean DelStudent(String sid);
	boolean UpdStudent(Student st);
	
	Student getStudentById(String sid);
	
	List<Student> getAllStudent();
	List<Student> SearchStudent(String s_student);
}	
