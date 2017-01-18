package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import domain.Employee;
import utility.JPAUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	
	public EmployeeDAOImpl() {
		EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	@Override
	public Employee insertEmployee(String name, String surname, int salary) {
		Employee employee = new Employee(name, surname, salary);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		return employee;
	}

	@Override
	public Employee findEmployeeById(int id) {
		
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e" , Employee.class);
		return query.getResultList();
	}

	@Override
	public void removeEmployee(int id) {
		Employee employee = findEmployeeById(id);
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
	
		
	}

}
