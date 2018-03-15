package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	
	public void insertStudent(Student student);
	
	public Student getStudentById(int id);
    
	public List<Student> getAllStudent();
	
	

}
