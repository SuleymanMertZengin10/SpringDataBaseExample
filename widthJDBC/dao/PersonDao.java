package dao;

import model.Person;

public interface PersonDao {

	public void insertPerson(Person person);
	public Person getPersonById(int id);
	
}
