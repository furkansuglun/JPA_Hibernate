package _03.notes;

public class Notes {

}



//javax.persistence.EntityManagerFactory interface
//javax.persistence.EntityManager
//javax.persistence.EntityTransaction
//javax.persistence.Query
//javax.persistence.Persistence


/// Persistence classi uzerinden EntityManagerFactory'i elde ederiz/aliriz/obtain.
//EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");

//EntityManagerFactory , EntityManager olusturmak sorumludur.
//EntityManager entityManager = emf.createEntityManager();

//1 EntityManagerFactory N tane EntityManager olusturabilir.
//1 EntityManagerFactory  1 tane PersistenceUnit tarafindan konfigure edilir.
//public @interface PersistenceUnit 

//EntityManager , Entity uzerindeki tum islemlerden sorumludur.

//persistence.xml dosyasinda birden fazla Persistence Unit tanimi yapabiliriz.
//persitence-unit , veritabanina baglanmak icin gerekli bilgiler, Entity class tanimlari ve cesitli konfigurasyon bilgileridir.

//Entity Manager tarafindan yonetilen tum Entity obje kumesine PersistenceContext adi verilir.



//resim :  http://injavawetrust.com/wp-content/uploads/jpa-concept.png