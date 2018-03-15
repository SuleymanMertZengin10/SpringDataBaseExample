package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	private CoffeType coffeType;
	public Customer() {
		super();
	}
	public Customer(String name, CoffeType coffeType) {
		super();
		this.name = name;
		this.coffeType = coffeType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CoffeType getCoffeType() {
		return coffeType;
	}
	public void setCoffeType(CoffeType coffeType) {
		this.coffeType = coffeType;
	}
    
	
	
}
