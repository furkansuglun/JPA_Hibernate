package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int ID;
	private String name;
	private String surname;
	private int slary;
	
	public Employee() {
		super();
	}
	
	
	public Employee(String name, String surname, int slary) {
		super();
		this.name = name;
		this.surname = surname;
		this.slary = slary;
	}


	public int getID() {
		return ID;
	}
	public void setID(int id) {
		this.ID = id;
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
	public int getSlary() {
		return slary;
	}
	public void setSlary(int slary) {
		this.slary = slary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + ID + ", name=" + name + ", surname=" + surname + ", slary=" + slary + "]";
	}
	
	
	
	
}
