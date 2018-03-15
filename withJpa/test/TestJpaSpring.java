package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ProductDaoImp;
import model.Product;

public class TestJpaSpring {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("jpa.spring.xml");
		ProductDaoImp productDaoImp=context.getBean("productDaoImp",ProductDaoImp.class);
		Product product1=new Product("telefon","Teknoloji");
		Product product2=new Product("koltuk","Mobilya");
		Product product3=new Product("araba","Ulaþým");
		
		productDaoImp.addProduct(product1);
		productDaoImp.addProduct(product2);
		productDaoImp.addProduct(product3);
		
		
		
	}
}
