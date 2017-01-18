package _03.oneToOne.uni.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _03.oneToOne.uni.model.Adress;
import _03.oneToOne.uni.model.Employee3;
import _03.oneToOne.uni.model.ParkSpace;
import _03.oneToOne.uni.model.Phone;
import _03.oneToOne.uni.model.Project;

public class JPAServiceImpl implements JPAService  {

	
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;
	
	public JPAServiceImpl() {
		emf = Persistence.createEntityManagerFactory("EmployeePersistenceUnit3");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee3 createEmployee(String name, String surname, int salary) {
		Employee3 employee3 = new Employee3(name, surname, salary);
		et.begin();
		em.persist(employee3);	
		et.commit();
		return employee3;
		
	}

	@Override
	public ParkSpace createParkingSpace(int parkLot, String loc) {
		ParkSpace parkSpace = new ParkSpace(parkLot, loc);
		et.begin();
		em.persist(parkSpace);	
		et.commit();
		return parkSpace;
	}

	@Override
	public Phone createPhone(String no, String type) {
		Phone phone = new Phone(no, type);
		et.begin();
		em.persist(phone);
		et.commit();
		return phone;
	}

	@Override
	public Project createProject(String projectName) {
		Project project = new Project(projectName);
		et.begin();
		em.persist(project);
		et.commit();
		return project;
	}

	@Override
	public Adress cretaeAdress(String street, String road, String no, String city) {
		Adress adress = new Adress(street, road, no, city);
		return adress;
	}

	
	
}
