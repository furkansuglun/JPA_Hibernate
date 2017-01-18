package _02.mapping.primarykey.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _02.mapping.primarykey.domain.Customer;
import _02.mapping.primarykey.domain.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public CustomerDAOImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("CustomerPersistenceUnit");
	//	entityManagerFactory = Persistence.createEntityManagerFactory("CustomerPersistenceUnitForHibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	@Override
	public void insertCustomer(String name) {

		Customer customer = new Customer(name);
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
	}

}
