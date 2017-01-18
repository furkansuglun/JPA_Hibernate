package _03.oneToOne.uni.service;
import javax.persistence.EntityManager;

import _03.oneToOne.uni.model.Adress;
import _03.oneToOne.uni.model.Employee3;
import _03.oneToOne.uni.model.ParkSpace;
import _03.oneToOne.uni.model.Phone;
import _03.oneToOne.uni.model.Project;
public interface JPAService {

	
	public EntityManager getEntityManager(); 
	
	public Employee3 createEmployee(String name, String surname,int salary);
	public ParkSpace createParkingSpace(int parkLot , String loc);
	public Phone createPhone(String no , String type);
	public Project createProject(String projectName);
	public Adress cretaeAdress(String street, String road, String no, String city);
}
