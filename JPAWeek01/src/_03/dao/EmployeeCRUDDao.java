package _03.dao;

import java.util.List;

import _03.model.Employee;

public interface EmployeeCRUDDao {

	
	
	public Employee insertEmployee(int ID,String name,String surname,int salary);
	public Employee findEmployeeById(int ID);
	public List<Employee> findAllEmployees();
	public void removeEmployee(int ID);
	public void updateEmployeeSalary(int ID,int raise);
	
}
