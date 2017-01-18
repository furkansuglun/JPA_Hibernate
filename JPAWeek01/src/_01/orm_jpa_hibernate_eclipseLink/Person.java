package _01.orm_jpa_hibernate_eclipseLink;

public class Person {

	private int id;
	private String name;
	private String surname;
	//db deki column lar buradaki deðiþkenlere karsýlýk gelecek ORM yaklaþýmý !
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
