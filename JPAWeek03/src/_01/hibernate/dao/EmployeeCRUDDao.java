package _01.hibernate.dao;

import java.util.List;

import _01.hibernate.model.Employee2;

public interface EmployeeCRUDDao {

	
	
	public Employee2 insertEmployee(String name,String surname,int salary);
	public Employee2 findEmployeeById(int ID);
	public List<Employee2> findAllEmployees();
	public void removeEmployee(int ID);
	public void updateEmployeeSalary(int ID,int raise);
	
	
}
