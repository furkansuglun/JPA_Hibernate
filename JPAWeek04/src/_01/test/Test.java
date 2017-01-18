package _01.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import _01.dao.EmployeeCRUDDao;
import _01.dao.EmployeeCRUDDaoImpl;
import _01.model.Employee;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();

		EmployeeCRUDDao employeeDAO = new EmployeeCRUDDaoImpl(entityManager);
		employeeDAO.insertEmployee(1, "ecir", "kucuksille", 5000);
		employeeDAO.insertEmployee(2, "enes", "acikoglu", 5000);
		employeeDAO.insertEmployee(3, "ertugrul", "ince", 5000);
		employeeDAO.insertEmployee(4, "ilker", "ozdal", 5000);

		// Employee foundEmployee = employeeDAO.findEmployeeById(1);
		// System.out.println(foundEmployee);

		// System.out.println("all employees");

		// List<Employee> empList=employeeDAO.findAllEmployees();
		//
		// for(Employee emp : empList){
		// System.out.println(emp);
		// }

		List<String> empListNames = employeeDAO.findAllEmployeesName();

		for (String emp : empListNames) {
			System.out.println(emp);
		}

		System.out.println("findEmployeeById");
		String name = employeeDAO.getEmployeeNameById(2);

		System.out.println(name);
		System.out.println("\n");
		List<Object[]> empNamesSalary = employeeDAO.getEmployeeNameAndSalary();

		for (Object[] namesSalary : empNamesSalary) {
			System.out.println(namesSalary[0] + " : " + namesSalary[1]); //burada 0 ->name 1->salary
		}
	}
}

// http://www.eclipse.org/eclipselink/api/2.6/index.html?org/eclipse/persistence/config/PersistenceUnitProperties.html

// dosya ismi persistence.xml olmalidir. dosya META-INF klasoru altinda
// olmalidir.
// Exception in thread "main" javax.persistence.PersistenceException: No
// Persistence provider for EntityManager named EmployeePersistenceUnit