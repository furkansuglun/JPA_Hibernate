package _01.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

@NamedQuery(name = "Employee.findAllEmployee", query = "Select e from Employee e")
@NamedQueries(value = { 
			
			@NamedQuery(name = "Employee.findByPK", query = "Select e from Employee e where e.ID =:employeeId")
		
		})

//named query'ler daha fazla verimlilik saðlar. çalýþma zamanýnda JPQL den SQL e çevirilir ve cache'lenir
//dynamic query'lere göre daha verimlidir.
//named query isimleri unique olmalýdýr.

public class Employee {

	@Id
	private int ID;
	private String name;
	private String surname;
	private int salary;
	
	
	//default constructor mutlaka tanimli olmalidir.
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
	
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
		return "Employee [id=" + ID + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	
}
