package _02.manyToOne.uni.service;

import javax.persistence.EntityManager;

import _02.manyToOne.uni.model.Employee;
import _02.manyToOne.uni.model.Department;

public interface JPAService {
	
	public EntityManager getEntityManager();
	public Employee createEmployee(String name, String surname, int salary);
	public Department createDepartment(String name);
	
	
}
