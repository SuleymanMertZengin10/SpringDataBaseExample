package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import model.Person;

public class PersonDaoImp implements PersonDao{

	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private static final String insertQuery="insert into person(id,name,surname,birthYear) values(?,?,?,?)";
	private static final String selectQuery="select *from person where person.id=?id";
	
	@Override
	public void insertPerson(Person person) {
	
		try {
			Connection con=dataSource.getConnection();
			PreparedStatement ps= con.prepareStatement(insertQuery);
			ps.setInt(1,person.getId());
            ps.setString(2, person.getName());
            ps.setString(3, person.getSurname());
            ps.setInt(4,person.getBirthYear());
            System.out.println("kayýtlar basarýyla eklendi");
            ps.execute();
            ps.close();
		} catch (Exception e) {
			

		}
		
	}

	@Override
	public Person getPersonById(int id) {
		
		return null;
	}
	

}
