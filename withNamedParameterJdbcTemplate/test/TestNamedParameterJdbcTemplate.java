package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImp;
import model.Student;

public class TestNamedParameterJdbcTemplate {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.namedparametertemplate.xml");
		StudentDaoImp	studentDaoImp=context.getBean("studentDaoImp",StudentDaoImp.class);
		Student student1=new Student(14, "Süleyman", "Zengin", 3210); 
		Student student2=new Student(15, "Hamdullah", "Yüce", 12345); 
		Student student3=new Student(16, "Sefa", "Üncü", 3213); 
		studentDaoImp.insertStudent(student1);
		studentDaoImp.insertStudent(student2);
		studentDaoImp.insertStudent(student3);
		System.out.println("id ile getirme");
		
		studentDaoImp.getStudentById(14);
		studentDaoImp.getStudentById(15);
		studentDaoImp.getStudentById(16);
		System.out.println("all student");
		studentDaoImp.getAllStudent();
		
		
		
		
		
	}

}
