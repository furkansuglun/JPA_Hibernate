package _03.oneToOne.uni.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	//id yok
	//entity yerne embeddable kullandýk
	private String street;
	private String road;
	private String no;
	private String city;
	
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Adress(String street, String road, String no, String city) {
		super();
		this.street = street;
		this.road = road;
		this.no = no;
		this.city = city;
	}



	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
