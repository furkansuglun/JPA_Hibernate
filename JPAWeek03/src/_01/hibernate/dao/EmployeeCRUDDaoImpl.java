package _01.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import _01.hibernate.model.Employee2;

public class EmployeeCRUDDaoImpl implements EmployeeCRUDDao {
	
	
	private EntityManager entityManager;

	public EmployeeCRUDDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public Employee2 insertEmployee(String name, String surname, int salary) {
	
		Employee2 employee = new Employee2(name, surname, salary);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		return employee;
	}

	@Override
	public Employee2 findEmployeeById(int ID) {
		Employee2 employee = entityManager.find(Employee2.class, ID);
		return employee;
	}

	@Override
	public List<Employee2> findAllEmployees() {
		
		TypedQuery<Employee2> query = entityManager.createQuery("Select e from Employee e", Employee2.class); // JPQL
		//Query query = entityManager.createQuery("Select e from Employee e");
		return query.getResultList();
		//employee tablosuna degil Employee entitisine sorgu yap�l�yor .
		
	}

	@Override
	public void removeEmployee(int ID) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Employee2 employee = findEmployeeById(ID);
		if(employee!=null) {
			entityManager.remove(employee);
		}
		transaction.commit();
		
	}

	@Override
	public void updateEmployeeSalary(int ID, int raise) {
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Employee2 employee = findEmployeeById(ID);
		if(employee!=null) {
			employee.setSalary(employee.getSalary()+raise);
		}
		
		transaction.commit();
		
	}

}
