package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDaoImp;
import model.Employee;

public class TestSpringJDBCTemplate {
    public static void main(String[] args) {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.jdbctemplate.xml");
    	EmployeeDaoImp employeeDao=context.getBean("employeeDaoImp",EmployeeDaoImp.class);
        Employee employee1=new Employee(1,"Suleyman", "Zengin", 5000); 
        Employee employee2=new Employee(2,"Hasan", "Yýlmaz", 3000);
        
    	employeeDao.insertEmployee(employee1);
    	employeeDao.insertEmployee(employee2);
    	
	}

	          
}
