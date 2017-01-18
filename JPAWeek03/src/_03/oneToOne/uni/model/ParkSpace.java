package _03.oneToOne.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkSpace {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private int parkLot;
	private String loc;
	
	//e�er bir taraf i�in mappedBy kullan�lmazsa bu durumda OneToOne ili�ki unidirectional olacakt�r.
	//burada 2 unidirectional olu�acakt�r.
	//biderctional ili�kiden s�z edebilmek i�in inverse side belirtilmelidri.bunun i�in mappedBy kullan�r�z.
	
	//mappedBy kullanmad�g�m�zda foreign bilgilerikar��l�kl� olarak 2 tabloda yer al�r.
	//buda �stenmeyen b�r durumdur
	//tek tabloda yer almas� �c�n mappedBy kullanmam�z gerekir. boylece
	//ili�ki 2 unidirectional olmak yer�ne 1 bidirectional olacakt�r.
	@OneToOne(mappedBy="parkingSpace")
	private Employee3 employee3;
	
	public ParkSpace() {
		// TODO Auto-generated constructor stub
	}
	
	public ParkSpace(int parkLot, String loc) {
		super();
		this.parkLot = parkLot;
		this.loc = loc;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	public int getParkLot() {
		return parkLot;
	}

	public void setParkLot(int parkLot) {
		this.parkLot = parkLot;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Employee3 getEmployee3() {
		return employee3;
	}

	public void setEmployee3(Employee3 employee3) {
		this.employee3 = employee3;
	}

	@Override
	public String toString() {
		return "ParkingSpace [ID=" + ID + ", parkLot=" + parkLot + ", loc=" + loc + "]";
	}
	
	
	
}
