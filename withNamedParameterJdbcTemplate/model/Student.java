package model;

public class Student {
	private int id;
	private String name;
	private String surname;
	private int  no;

	
	public Student() {
		super();
	}

	public Student(int id, String name, String surname, int no) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.no = no;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", no=" + no + "]";
	}
	
	
	
	
	

}
