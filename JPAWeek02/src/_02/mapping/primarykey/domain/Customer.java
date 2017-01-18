package _02.mapping.primarykey.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO) //AI id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	
	//@TableGenerator(name="CUSTOMER_GEN_TABLE")
	//@GeneratedValue(generator="CUSTOMER_GEN_TABLE") //ayrý ayrý table lara ayrýmýþ oluyoruz id leri sequence tablosunda
	
	//@TableGenerator(name = "CUSTOMER_GEN_TABLE_DETAILED", table = "ID_GEN_TABLE", 
		//pkColumnName = "ID_GEN_NAME", valueColumnName = "ID_GEN_COUNT", initialValue = 100, allocationSize = 10)
	//@GeneratedValue(generator="CUSTOMER_GEN_TABLE_DETAILED")
	
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	// oracle ;
		// create sequence mySequence;
		//@SequenceGenerator(name="CUSTOMER_SEQUENCE" ,sequenceName="mySequence")
		//@GeneratedValue(generator="CUSTOMER_SEQUENCE")
		
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int ID;
	private String name;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
