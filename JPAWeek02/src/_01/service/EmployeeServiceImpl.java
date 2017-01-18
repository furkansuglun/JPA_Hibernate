package _01.service;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _01.domain.Employee;
import _01.domain.EmployeeType;

public class EmployeeServiceImpl implements EmployeeService {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public EmployeeServiceImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	@Override
	public void insertEmployee(int ID, String name, String surname) {
		byte[] image = { 1, 1, 2, 1, 1, 1, 2, 2, 3, 4, 5, 0 };
		char[] info = { 'a', 'b', 'c' };
		Employee employee = new Employee(ID, name, surname, EmployeeType.FULL_TIME, true, new Date(), image, info);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
