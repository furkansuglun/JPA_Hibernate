package _01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import _01.model.Employee;
import _01.model.EmployeeDetails;

public class EmployeeCRUDDaoImpl implements EmployeeCRUDDao {

	private EntityManager entityManager;

	public EmployeeCRUDDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee insertEmployee(int id, String name, String surname, int salary) {

		Employee employee = new Employee(id, name, surname, salary);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();

		return employee;
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", Employee.class); // JPQL
		// Query query = entityManager.createQuery("Select e from Employee e");
		return query.getResultList();
	}
	
	@Override
	public List<String> findAllEmployeesName() {
		TypedQuery<String> query = entityManager.createQuery("Select e.name from Employee e", String.class); // JPQL
		return query.getResultList();
	}

	@Override
	public String getEmployeeNameById(int id) {
		
		//Positional Parameter
		
		// TypedQuery<String> query = entityManager
		// .createQuery("Select e.name from Employee e where e.id=?1",
		// String.class).setParameter(1, id); // JPQL

	
		//Named Parameter   -->   :employeeId ismini kullandýk
		TypedQuery<String> query = entityManager
				.createQuery("Select e.name from Employee e where e.ID=:employeeId", String.class)
				.setParameter("employeeId", id); // JPQL
		return query.getSingleResult(); //tek sonuc döndür
	}
	
	@Override
	public List<Object[]> getEmployeeNameAndSalary(){	
		TypedQuery<Object[]> query = entityManager
				.createQuery("Select e.name,e.salary from Employee e", Object[].class);
		return query.getResultList();
	}
	
	//contructor expression
	@Override
	public List<EmployeeDetails> getEmployeeNameAndSalaryEmployeeDetails(){	
		TypedQuery<EmployeeDetails> query = entityManager
				.createQuery("Select New _01.model.EmployeeDetails(e.name,e.salary) from Employee e", EmployeeDetails.class);
		//bu sekilde geriye list döner
		//constuructor yapýsý var JPQL sorgusunda EmployeeDetails(name,salary) !!
		return query.getResultList();
	}

	@Override
	public void removeEmployee(int id) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Employee employee = findEmployeeById(id);
		if (employee != null) {
			entityManager.remove(employee);
		}
;		transaction.commit();
	}

	@Override
	public void updateEmployeeSalary(int id, int raise) {

		EntityTransaction transaction = entityManager.getTransaction();

		Employee employee = findEmployeeById(id);

		transaction.begin();

		if (employee != null) {
			System.out.println("test");
			employee.setSalary(employee.getSalary() + raise);
		}

		transaction.commit();

	}

	@Override
	public List<Employee> findAllEmployeeByNamedQuery() {
		//TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", String.class); // JPQL dynamic query
		TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findAllEmployee",Employee.class); //named query
		return query.getResultList();
	}

	@Override
	public Employee findEmployeeByIdNamedQuery(int id) {
		TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByPK" , Employee.class)
				.setParameter("employeeId", id); //named query
		return query.getSingleResult();
	}

}
