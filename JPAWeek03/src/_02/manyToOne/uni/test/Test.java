package _02.manyToOne.uni.test;

import javax.persistence.EntityTransaction;

import _02.manyToOne.uni.model.Employee;
import _02.manyToOne.uni.model.Department;
import _02.manyToOne.uni.service.JPAService;
import _02.manyToOne.uni.service.JPAServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		JPAService jpaService = new JPAServiceImpl();
		
		Employee employee = jpaService.createEmployee("Furkan", "Suglun", 12000);
		Employee employee2 = jpaService.createEmployee("Ýlknur", "Erol", 12000);
		Employee employee3 = jpaService.createEmployee("ali", "veli", 2000);
		
		Employee employee4 = jpaService.createEmployee("name1", "surname1", 1000);
		Employee employee5 = jpaService.createEmployee("name2", "surname2", 6000);
		
		Department department = jpaService.createDepartment("Software Department");
		Department department2 = jpaService.createDepartment("Human Resources");
		
		
		EntityTransaction entityTransaction = jpaService.getEntityManager().getTransaction();
		entityTransaction.begin();
		employee.setDepartment(department);
		employee2.setDepartment(department);
		employee3.setDepartment(department);
		
		employee4.setDepartment(department2);
		employee5.setDepartment(department2);
		entityTransaction.commit();
		
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		
	}
	
}
