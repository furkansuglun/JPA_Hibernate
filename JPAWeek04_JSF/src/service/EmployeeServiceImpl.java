package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	
	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}
	
	@Override
	public Employee insertEmployee(String name, String surname, int salary) {
		return employeeDAO.insertEmployee(name, surname, salary);
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		return employeeDAO.findEmployeeById(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();
	}

	@Override
	public void removeEmployee(int id) {
		employeeDAO.removeEmployee(id);
	}
	
	//
	// herhangi bir kontrol , business logic Service Layer'da yer almalidir.
	// DAO katmaninda business logic yer almamalidir.
	// her zaman service layer ---> dao layer'a olmalidir.
	// tersi olmamalidir!

}
