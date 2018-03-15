package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	private static final String insertQuery="insert into employee(id,name,surname,maas) values(?,?,?,?)";
	
	//import org.springframework.jdbc.core.JdbcTemplate; Springin bir sýnýfý pom.xmle eklentileri unutmayalým!--
	private JdbcTemplate jdbcTemplate;


	public EmployeeDaoImp() {
		super();
	}




	public EmployeeDaoImp(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}




	@Override
	public void insertEmployee(Employee employee) {
		try {
			Object[] insertParams=new Object[]{employee.getId(),employee.getName(),employee.getSurname(),employee.getMaas()};
			jdbcTemplate.update(insertQuery,insertParams);
			
			System.out.println("eklememe iþlemi basarýyla tamamlandý"+employee);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

}
