package _03.relationship;

public class Notes {

}


//### 
//Role
//Directionality
//Cardinality
//Ordinality/Optionality

//###  Role
//bir iliski icin 2 taraf olmasi gereklidir.
//taraf -> entity
//her iliskide birbiriyle ilgili 2 tane Entity vardir.Her Entity bu iliskide bir rol oynar.

//Employee  , departmanda calisan isci rolunu oynar
//Department , departman da iscilerin calistigi yer/lokasyon.

//#### Directionality
//bir iliskide bir entity'in diger enttiy'i isaret etmesi/gostermesi kavramidir.
//bidirectional ve unidirectional olarak 2 ye ayrilir.

//java kodu olarak baktigimizda 

//public class Employee {
//	private int id;
//	private String name;
//	private Address address;
//}
//
//class Address {
//	private int id;
//	private String city;
//	//
//}

//#### Cardinality
//nicelik

//OneToOne
//OneToMany
//ManyToOne
//ManyToMany olarak 4 e ayrilir.

//bir Department' da birden fazla Employee calisabilir.
//Bir Employee sadece bir Department da calisabilir.

//ManyToOne iliskisi ->
//Many ->Employee
//One -> Department

//OneToOne iliskisi ->
//One -> Employee
//One -> ParkingSpace

//## Ordinality / Optionality
//bir iliskide Entit'in zorunlu olup olmamasi/secimli olup olmamasi/optional durumudur.
//Customer ve CustomerBillingInfo gibi Entity'ler olsun.
//burada CustomerBillingInfo , Customer'a mutlaka baglidir. Customer yoksa CustomerBillingInfo'nun varligindan soz edemeyiz.
//fakat diger acidan baktigimizda Customer , Customerbillinginfo olmadan da var olabilir.

