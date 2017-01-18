package _03.oneToOne.uni.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

@Entity(name="employee3")
public class Employee3 {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int ID;
	private String name;
	private String surname;
	private int salary;
	
	@OneToOne
	@JoinColumn(name="park_id" , unique=true)
	private ParkSpace parkingSpace;
	
	@OneToMany
	//one to many de default olarak 3. tablo olusur
	//bu tablo ismini ver column isimlerini override etmek için alttakiler kullanýlabýlýr
	@JoinTable(name="emp_phone" , joinColumns =  @JoinColumn(name="emp_ID") , inverseJoinColumns = @JoinColumn(name="phone_ID"))
	//one --> EMployee
	//mnay -->> Phone
	//bir kisinin býrden fazla teleofnu olabilir. ve bu telfon sadec býrk ýsýye aýt olabilir 
	//iþte boyle durumda collection list olusturduk ...
	private List<Phone> phone = new ArrayList<Phone>();
	
	
	
	@ManyToMany
	private List<Project> project = new ArrayList<Project>();
	
	@Embedded
	@AttributeOverride(name="city" , column=@Column(name="sehir"))
	@AttributeOverrides(value= {
			@AttributeOverride(name="road" , column=@Column(name="cadde")),
			@AttributeOverride(name="street" , column=@Column(name="sokak"))
			
	})
	private Adress adress;
	
	//bir calisanin birden fazla email adresi olabilir.
	//target cardinality manytomany ve onetomany iliskilerde many'dir.
	// bu ornekler icin @ManyToMany annotation ya da @OneToMany annotation kullandik ve bir collection yapisi kullandik.
	//burada ise target cardinality bir basic types--> String 
	//bu noktada @OneToMany iliski yerine @ElementCollection //annotation1i// kullaniriz.
	@ElementCollection
	@CollectionTable(name="EMP_EMAILS" ,joinColumns=@JoinColumn(name="EMP_ID"))
	@Column(name="emp_emails")
	List<String> emails = new ArrayList<String>();
	
	
	public Employee3() {
		// TODO Auto-generated constructor stub
	}

	public Employee3(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public ParkSpace getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(ParkSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	
	
	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	



	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Employee3 [ID=" + ID + ", name=" + name + ", surname=" + surname + ", salary=" + salary
				+ ", parkingSpace=" + parkingSpace + ", phone=" + phone + ", project=" + project + "]";
	}

	
	
		
	
	
	
	
	
}
