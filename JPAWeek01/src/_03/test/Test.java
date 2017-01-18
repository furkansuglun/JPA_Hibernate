package _03.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import _03.dao.EmployeeCRUDDao;
import _03.dao.EmployeeCRUDDaoImpl;
import _03.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();

		EmployeeCRUDDao employeeDAO = new EmployeeCRUDDaoImpl(entityManager);
		employeeDAO.insertEmployee(1, "anil", "durakcan", 5000);
		employeeDAO.insertEmployee(2, "mehmet", "tanlak", 5000);
		
		Employee foundEmployee=employeeDAO.findEmployeeById(1);
		System.out.println(foundEmployee);
		
		System.out.println("all employees");
		
		List<Employee> empList=employeeDAO.findAllEmployees();
		
		for(Employee emp : empList){
			System.out.println(emp);
		}
		
		
		employeeDAO.removeEmployee(1);
		

		System.out.println("after remove");
		List<Employee> empListRemove=employeeDAO.findAllEmployees();
		
		for(Employee emp : empListRemove){
			System.out.println(emp);
		}
		
		
		System.out.println("After Update Salary");
		employeeDAO.updateEmployeeSalary(2, 2000);
		
		
	}

	

	// http://www.eclipse.org/eclipselink/api/2.6/index.html?org/eclipse/persistence/config/PersistenceUnitProperties.html

	//dosya ismi persistence.xml olmalidir. dosya META-INF klasoru altinda olmalidir.
	// Exception in thread "main" javax.persistence.PersistenceException: No
	// Persistence provider for EntityManager named EmployeePersistenceUnit
	
}
