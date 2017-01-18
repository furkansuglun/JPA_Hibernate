package _02.entity;

public class Notes {

}


//Entity kavrami Javadan da eski bir kavramdir.

//Entity , "varlik" anlamina gelmektedir.Java acisindan JPA gozuyle baktigimizda
//Kalici nesne/persistent object olarak ifade edebiliriz.

//1)Persistable
//Entity'lerin durumu/state/instance variable i kaydedilebilir olmali ve sonrasinda bu Entity'e ulasabilir olmaliyiz.

//2)Identity

//identity-> kimlik bilgisi , primary key bilgisidir.
//ayni tipteki entity'leri ayirmak icin primary key bilgisinden yararlaniriz.

//Bir entity taniminda mutlaka @Id tanimini kullaniriz yani , idendtity bilgisi tanimlariz.

//3)Transactionality

//Transcation -> turkcesi "islem".

//transaction kavrami , guvenilir/reliable uygulamalar icin olmazsa olmazdir!

//ACID

//atomicity
//transaction bir/birden fazla adimdan/isten/is parcacigindan meydana gelir.
//atomic kuralinda ya hep ya hic kurali calisir/ all or nothing.
//herhangi bir adimda problem oldugunda oncesindeki islemler/adimlar aynen geriye alinmalidir(rollback)

//consistent
//tutarli
//bir veritabani sistemi dusundugumuzde , insert, delete , update gibi islemler tutali olmalidir.

//bir EFT yaptik , 1000 lira gonderdik , karsiya da 1000lira gecmesi gereklidir! Consistent olmalidir.


//isolated
//ayni data uzerinde yazma islemine engel olunmalidir.
//transactionlar birbirinden etkilenmemelidir, isole olmalidir.


//durability/ saglam/kalici/dayanikli
//bir transaction sonlandiginda kalici hale gelmelidir.  commit edilmelidir.

//4) Granularity
//tanecikli yapida olma,
//ortalama oge boyu , demek istedigimiz nispete bu.

//javada String , Integer , Long gibi classlar var.
//bunlar fine-grained(ince tanecikli) bir yapiya sahiptir.

//entity classlarimiz , business domain object olmalidir.

//bir kutuphane uygulamasi dusundugumuzde
//Book , Publisher , Author gibi kavramlari/classlari/objecleri dusunebiliriz.

//E-commerce
//Product , Customer , ShoppingCart ,Transaction , Order kavramlari dusunebiliriz.


//An entity is a lightweight persistent domain object.
//kalýcý nesnemiz , minimum etki ve deðiþiklik ile kaydedilebilir ve ulaþýlabilir , büyük yapýda (bussiness domain) dýr.

//lightweight -> hafif anlamina gelir.
//bu kavram , az kod olmasi olarak ifade edilmez.
//module yapi olmasi anlamina gelmektedir.
//yani bir degisiklik yaptigimizda minimum impact/etki ve 
//bu degisikligi yapmak icin minimum degisiklik gerekmesi anlamian gelir , lightweight.