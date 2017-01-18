package _02.mapping.primarykey.test;

import _02.mapping.primarykey.dao.CustomerDAOImpl;
import _02.mapping.primarykey.domain.CustomerDAO;

public class Test02 {

	public static void main(String[] args) {

		CustomerDAO customerDAO = new CustomerDAOImpl();

		customerDAO.insertCustomer("Furkan");

	}

}
