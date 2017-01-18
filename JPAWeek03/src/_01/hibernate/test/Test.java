package _01.hibernate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import _01.hibernate.dao.EmployeeCRUDDao;
import _01.hibernate.dao.EmployeeCRUDDaoImpl;
import _01.hibernate.model.Employee2;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePersistenceUnitForHibernate");
		EntityManager entityManager = emf.createEntityManager();

		EmployeeCRUDDao employeeDAO = new EmployeeCRUDDaoImpl(entityManager);
		employeeDAO.insertEmployee( "anil", "durakcan", 5000);
		employeeDAO.insertEmployee( "mehmet", "tanlak", 5000);
		employeeDAO.insertEmployee( "furkan", "suglun", 12000);
		
		Employee2 foundEmployee=employeeDAO.findEmployeeById(1);
		System.out.println(foundEmployee);
		
		System.out.println("all employees");
		
		List<Employee2> empList=employeeDAO.findAllEmployees();
		
		for(Employee2 emp : empList){
			System.out.println(emp);
		}
		
		
		employeeDAO.removeEmployee(1);
		

		System.out.println("after remove");
		List<Employee2> empListRemove=employeeDAO.findAllEmployees();
		
		for(Employee2 emp : empListRemove){
			System.out.println(emp);
		}
		
		
		System.out.println("After Update Salary");
		employeeDAO.updateEmployeeSalary(2, 2000);
		
		List<Employee2> empListAfterUpdate=employeeDAO.findAllEmployees();
		
		for(Employee2 empL : empListAfterUpdate){
			System.out.println(empL);
		}
		
	}

	

	// http://www.eclipse.org/eclipselink/api/2.6/index.html?org/eclipse/persistence/config/PersistenceUnitProperties.html

	//dosya ismi persistence.xml olmalidir. dosya META-INF klasoru altinda olmalidir.
	// Exception in thread "main" javax.persistence.PersistenceException: No
	// Persistence provider for EntityManager named EmployeePersistenceUnit
	
}
