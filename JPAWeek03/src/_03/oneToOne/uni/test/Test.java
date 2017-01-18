package _03.oneToOne.uni.test;


import javax.persistence.EntityTransaction;

import _03.oneToOne.uni.model.Adress;
import _03.oneToOne.uni.model.Employee3;
import _03.oneToOne.uni.model.ParkSpace;
import _03.oneToOne.uni.model.Phone;
import _03.oneToOne.uni.model.Project;
import _03.oneToOne.uni.service.JPAService;
import _03.oneToOne.uni.service.JPAServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		JPAService jpaService = new JPAServiceImpl();
		
		
		Employee3 employee = jpaService.createEmployee("Furkan", "Suglun", 12000);
		Employee3 employee2 = jpaService.createEmployee("Ýlknur", "Erol", 12000);
		Employee3 employee3 = jpaService.createEmployee("ali", "veli", 2000);
		
		
		ParkSpace parkingSpace = jpaService.createParkingSpace(10, "Location1");
		ParkSpace parkingSpace2 = jpaService.createParkingSpace(15, "Location2");
		ParkSpace parkingSpace3 = jpaService.createParkingSpace(20, "Location3");
		
	
		EntityTransaction entityTransaction = jpaService.getEntityManager().getTransaction();
		
		entityTransaction.begin();
		employee.setParkingSpace(parkingSpace);
		employee2.setParkingSpace(parkingSpace2);
		employee3.setParkingSpace(parkingSpace3);
	
		
		/*iki tane ayný durum olacak istemeyiz boyle
		 * parkingSpace.setEmployee3(employee);
		parkingSpace2.setEmployee3(employee2);
		parkingSpace3.setEmployee3(employee3);*/
		entityTransaction.commit();
		
		
		Phone phone1 = jpaService.createPhone("0333", "Mobile");
		Phone phone2 = jpaService.createPhone("0554", "HOME");
		Phone phone3 = jpaService.createPhone("0543", "WORK");
		Phone phone4 = jpaService.createPhone("0524", "Mobile");
		Phone phone5 = jpaService.createPhone("0546", "Mobile");
		
		entityTransaction.begin();
		employee.getPhone().add(phone1);
		employee2.getPhone().add(phone2);
		employee2.getPhone().add(phone3);
		employee3.getPhone().add(phone4);
		employee3.getPhone().add(phone5);
		entityTransaction.commit();
		
		
		Project project1 = jpaService.createProject("Web Project");
		Project project2 = jpaService.createProject("Android Project");
		
		entityTransaction.begin();
		employee.getProject().add(project1);
		employee2.getProject().add(project1);
		employee3.getProject().add(project2);
		
		employee.getProject().add(project2);
		employee3.getProject().add(project1);
		entityTransaction.commit();
		
		
		
		Adress adress1 = jpaService.cretaeAdress("street1", "road1", "no1", "city1");
		Adress adress2 = jpaService.cretaeAdress("street2", "road2", "no2", "city2");
		Adress adress3 = jpaService.cretaeAdress("street3", "road3", "no3", "city3");
		
		entityTransaction.begin();
		employee.setAdress(adress1);
		employee2.setAdress(adress2);
		employee3.setAdress(adress3);
		entityTransaction.commit();
		
		
		
		String email1 = "a@bhotmail.com";
		String email2 = "a@bhotmail.com";
		String email3 = "a@bhotmail.com";
		String email4 = "a@bhotmail.com";
		String email5 = "a@bhotmail.com";
		
		entityTransaction.begin();
		employee.getEmails().add(email1);
		employee2.getEmails().add(email2);
		employee3.getEmails().add(email3);
		employee.getEmails().add(email4);
		employee2.getEmails().add(email5);
		entityTransaction.commit();
		
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		
	}
	
}
