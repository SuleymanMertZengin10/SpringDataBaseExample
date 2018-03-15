package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import model.Student;

public class StudentDaoImp implements StudentDao{

	private final static String insertStudent="insert into student(id,name,surname,no) values(:id,:name,:surname,:no)";
	private final static String getStudentById="select*from student where id=:id";
	private final static String getAllStudent="select*from student";
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public StudentDaoImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		super();
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void insertStudent(Student student) {
	Map<String, Object> params=new HashMap<>();
	params.put("id", student.getId());
	params.put("name",student.getName());
	params.put("surname", student.getSurname());
	params.put("no",student.getNo());
	namedParameterJdbcTemplate.update(insertStudent, params);

		
	}

	@Override
	public Student getStudentById(int id) {
		SqlParameterSource namedParamaters=new MapSqlParameterSource().addValue("id",id);
		Student student=namedParameterJdbcTemplate.queryForObject(getStudentById, namedParamaters,new StudentRowMapper());
		System.out.println("student bulundu"+student);
		
      return student;
	}

	@Override
	public List<Student> getAllStudent() {
		
	List<Student>allStudent=	namedParameterJdbcTemplate.query(getAllStudent,new StudentRowMapper());
		
	System.out.println("tüm studentlar");
	for(Student student:allStudent)	{
		System.out.println(student);
	}
	return allStudent;
	
	}

}
