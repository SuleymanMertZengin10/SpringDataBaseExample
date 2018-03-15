package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDaoImp;
import model.Person;

public class TestSpringJdbc {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.jdbc.xml");
		PersonDaoImp personDaoImp=context.getBean("personDaoImp",PersonDaoImp.class);
		Person person1=new Person(1, "Suleyman", "Zengin", 1996);
		Person person2=new Person(2, "Eren", "Zengin", 2002);
		Person person3=new Person(3, "Bekir", "Zengin", 1995);
		
		personDaoImp.insertPerson(person1);
		personDaoImp.insertPerson(person2);
		personDaoImp.insertPerson(person3);
		
	}

}
