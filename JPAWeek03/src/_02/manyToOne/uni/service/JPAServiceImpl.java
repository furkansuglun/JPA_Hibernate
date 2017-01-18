package _02.manyToOne.uni.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _02.manyToOne.uni.model.Employee;
import _02.manyToOne.uni.model.Department;

public class JPAServiceImpl implements JPAService {

	EntityManager entityManager;
	EntityManagerFactory entityManagerFactory;
	EntityTransaction entityTransaction;
	
	public JPAServiceImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit2");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	@Override
	public EntityManager getEntityManager() {
		
		return entityManager;
	}

	@Override
	public Employee createEmployee(String name, String surname, int salary) {
		
		Employee employee = new Employee(name, surname, salary);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		return employee;
	}

	@Override
	public Department createDepartment(String name) {
		Department department = new Department(name);
		entityTransaction.begin();
		entityManager.persist(department);
		entityTransaction.commit();
		
		return department;
	}
	
	
}
