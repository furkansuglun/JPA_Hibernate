package utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	//insert-delete-udpate gibi i�lemler i�in emf em kullan�caz onlari utility de tam�lad�k
	public static EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
