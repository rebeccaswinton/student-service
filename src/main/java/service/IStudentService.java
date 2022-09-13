package service;

import java.util.List;

import entity1.Student;

public interface IStudentService {
//CRUD operations
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public Student updateStudent(Student student);
	public boolean deleteStudent (int id);
	
	
	
	
	
}
