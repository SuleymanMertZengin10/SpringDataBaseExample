package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CustomerDaoImp;
import model.CoffeType;
import model.Customer;

public class TestJpaDetails {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("jpa.detailed.xml");
		
		CustomerDaoImp customerDaoImp=context.getBean("customerDAOImpl",CustomerDaoImp.class);
		Customer customer1=new Customer("Süleyman",CoffeType.Americano);
		Customer customer2=new Customer("Hamdullah",CoffeType.Cappuccino);
		Customer customer3=new Customer("Sefa",CoffeType.Espresso);
		customerDaoImp.insertCustomer(customer1);
		customerDaoImp.insertCustomer(customer2);
		customerDaoImp.insertCustomer(customer3);
		
	}

}
