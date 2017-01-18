package _01.test;

import _01.service.EmployeeService;
import _01.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();

		employeeService.insertEmployee(1, Messages.getString("Test.0"), Messages.getString("Test.1")); //$NON-NLS-1$ //$NON-NLS-2$

	}

}
