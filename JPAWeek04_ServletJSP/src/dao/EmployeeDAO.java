package dao;

import java.util.List;

import domain.Employee;

public interface EmployeeDAO {
	
	public Employee insertEmployee(String name , String surname, int salary);
	public Employee findEmployeeById(int id);
	public List<Employee> findAllEmployees();
	public void removeEmployee(int id);
	
	
}
