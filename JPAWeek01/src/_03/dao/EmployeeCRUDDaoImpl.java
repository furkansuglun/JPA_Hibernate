package _03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import _03.model.Employee;

public class EmployeeCRUDDaoImpl implements EmployeeCRUDDao {
	
	
	private EntityManager entityManager;

	public EmployeeCRUDDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public Employee insertEmployee(int ID, String name, String surname, int salary) {
	
		Employee employee = new Employee(ID, name, surname, salary);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		return employee;
	}

	@Override
	public Employee findEmployeeById(int ID) {
		Employee employee = entityManager.find(Employee.class, ID);
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
		
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", Employee.class); // JPQL
		//Query query = entityManager.createQuery("Select e from Employee e");
		return query.getResultList();
		//employee tablosuna degil Employee entitisine sorgu yapýlýyor .
		
	}

	@Override
	public void removeEmployee(int ID) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Employee employee = findEmployeeById(ID);
		if(employee!=null) {
			entityManager.remove(employee);
		}
		transaction.commit();
		
	}

	@Override
	public void updateEmployeeSalary(int ID, int raise) {
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Employee employee = findEmployeeById(ID);
		if(employee!=null) {
			employee.setSalary(employee.getSalary()+raise);
		}
		
		transaction.commit();
		
	}

}
