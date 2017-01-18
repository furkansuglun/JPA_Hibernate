package _01.dao;

import java.util.List;

import _01.model.Employee;

public interface EmployeeCRUDDao {

	public Employee insertEmployee(int id, String name, String surname, int salary);

	public Employee findEmployeeById(int id);

	public List<Employee> findAllEmployees();

	public void removeEmployee(int id);

	public void updateEmployeeSalary(int id, int raise);

	public List<String> findAllEmployeesName();

	public String getEmployeeNameById(int id);

	public List<Object[]> getEmployeeNameAndSalary();
}
