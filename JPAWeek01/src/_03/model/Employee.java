package _03.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int ID;
	private String name;
	private String surname;
	private int salary;
	
	//default constructor mutlaka tan�ml� olmal�d�r ve public olmal�d�r
	public Employee() {
		super();
	}
	
	public Employee(int ID, String name, String surname, int salary) {
		super();
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	
	public int getId() {
		return ID;
	}
	public void setId(int ID) {
		this.ID = ID;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}

	
	
	
}
