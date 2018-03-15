package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	//burada veri taban�ndan teker teker cekece�iz ve geriye obje �eklinde dondurece�iz
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");  
        int no =  rs.getInt("no");
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSurname(surname);
        student.setNo(no);
        return student;
	}
	
	
	

}
