package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import domain.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@ManagedBean(name="employeeController")
@SessionScoped
public class EmployeeController {

	
	private String name;
	private String surname;
	private int slary;
	private List<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee() {
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.insertEmployee(name, surname, slary);
		
		employees = employeeService.findAllEmployees();
	}
	
	public void deleteEmployee(int id) {

			EmployeeService employeeService = new EmployeeServiceImpl();
			employeeService.removeEmployee(id);
			
			employees = employeeService.findAllEmployees();
		
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

	public int getslary() {
		return slary;
	}

	public void setslary(int slary) {
		this.slary = slary;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
	
	
}

//controller --> service layer --> dao layer a ulasmalidir.

//domain layer a ulasim her yerden olabilir problem teskil etmez.

//bootstrap
//http://www.layoutit.com/
//https://datatables.net/examples/styling/bootstrap.html
//http://glyphicons.bootstrapcheatsheets.com/