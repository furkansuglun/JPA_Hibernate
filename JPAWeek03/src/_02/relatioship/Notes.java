package _02.relatioship;

public class Notes {

}
//Role
//Bir iliskiede/relationship 2 tarafin varligi soz konusudur.
//Her iliskdide 2 tane Entity vardir. Her Entity bu iliskide bir rol oynar.

//Employee-Department , Employee , departmanda calisma rolunu oynar.
//Deparment ise , iscilerin calistigi yer rolunu oynar.


//Directionality
//BIr iliskide bir Entity'in , diger Entity'i gostermesi kavramidir.
//Eger sadece bir tanesini gosteriyorsa ozaman Unidirectional , eger 2 Entity'de birbirini gosteriyorsa Bidirectional iliskidir.

//Cardinality
//cardinality-->nicelik

//bir deparmanda birden fazla isci calisabilir.
//many ->employee
//one -->deparment

//bir projede birden fazla isci calisabilir.
//bir isci birden fazla projede calisabilir

//many--> employee
//many--> project

//ordinality//optionality
//Bu kavram --> Customer ve BillingInfo (fatura bilgisi) Entityleri olsun.
//BillingInfodan bahsedbilmek icin Customer zorunludur. Tek basin faturabilgisinden/entity den bahsedemeyiz.
//Fakat Customer tek basina dusunebiliriz.

//burada oldugu gibi bir iliskideki zorunlu/mandatory ya da secimlilik/optional olma durumu.


//One , Many

//4 tane durum ortaya cikacaktir.

//@ManyToOne
//@OneToOne
//@OneToMany
//@ManyToMany

//Unidirectional Vs Bidirectional
//2 entity birbirini gosteriyorsa bidirectional aksi durumda unidirectionaldir.
//bir iliski ya unidirectinal dir ya da bidirectional dir.
//bidirectional iliskilerde hem owning side hem de inverse side vardir.
//unidirectional iliskilerde sadece owning side vardir.

//Single-Valued Relationshion
//Bir iliskiede hedef cardinality One ise bu iliski Single-Valued iliskidir.

//ManyToOne
//OneToOne

//Collection-Valued Relationship

//OneToMany
//ManyToMany