package _02.manyToOne.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int ID;
	private String name;
	private String surname;
	private int salary;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private Department department;
	//Many --> Employee , owning side
	//One --> Department
	//Unidirectional iliski.
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + ID + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", department="
				+ department + "]";
	}


	
	
}
