package utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	//insert-delete-udpate gibi iþlemler için emf em kullanýcaz onlari utility de tamýladýk
	public static EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
