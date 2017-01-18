package _01.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Employee_table") // tablo ismini deðiþtirebiliriz
public class Employee {

	@Id
	@Column(name = "employee_id")
	private int ID;
	@Column(name = "first_name")
	private String name;
	@Column(name = "last_name")
	private String surname;

	@Enumerated(EnumType.STRING)
	// default olarak EnumType.ORDINAL calisir.
	// enum'lar sirasiyla 0 , 1 ,2... seklinde gider.
	// FULL_TIME, PART_TIME, CONTRACTED
	// 0 , 1 , 2
	// db ye string oldugunda full_time yazar ordinal de ise 0 , 1 ,2 index
	// numaralarýný yazar
	private EmployeeType employeeType;

	private boolean married;

	@Temporal(TemporalType.TIME) // TIMESTAMP VE DATE DE VAR
	private Date startDate;

	@Lob
	private byte[] image;

	private char[] info;

	// contructor

	public Employee() {
		super();
	}

	// Builder design pattern a bak !!
	public Employee(int iD, String name, String surname, EmployeeType employeeType, boolean married, Date startDate,
			byte[] image, char[] info) {
		super();
		ID = iD;
		this.name = name;
		this.surname = surname;
		this.employeeType = employeeType;
		this.married = married;
		this.startDate = startDate;
		this.image = image;
		this.info = info;
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

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char[] getInfo() {

		return info;
	}

	public void setInfo(char[] info) {
		this.info = info;
	}

}
