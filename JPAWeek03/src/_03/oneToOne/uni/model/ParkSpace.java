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
	
	//eðer bir taraf için mappedBy kullanýlmazsa bu durumda OneToOne iliþki unidirectional olacaktýr.
	//burada 2 unidirectional oluþacaktýr.
	//biderctional iliþkiden söz edebilmek için inverse side belirtilmelidri.bunun için mappedBy kullanýrýz.
	
	//mappedBy kullanmadýgýmýzda foreign bilgilerikarþýlýklý olarak 2 tabloda yer alýr.
	//buda ýstenmeyen býr durumdur
	//tek tabloda yer almasý ýcýn mappedBy kullanmamýz gerekir. boylece
	//iliþki 2 unidirectional olmak yerýne 1 bidirectional olacaktýr.
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
