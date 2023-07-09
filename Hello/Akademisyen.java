package Hello;
public class Akademisyen extends Calisan { //calışanın alt sınıfı - kalıtım 
//public abstract class Akademisyen extends Calisan { // akademisyen sınıfı soyutlandı


String bolum, gorevler ;
String ders;
//Akademisyen için de constructor olusturmalıyız

public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
super(adSoyad, eposta, telefon);
this.bolum = bolum;
this.gorevler = gorevler;
this.ders = ders;
}


public void derseGir () {
System.out.println("Derse Girildi"); // akademisyene yazdırdıgımız metot tum alt sınıflarda çalışır
}





// akademisyen sınıfı soyutlandıgı icin, derse gir metodunu soyutlayabiliriz.
// akademisyen sınıfından nesne uretmeyi engelliyorum, soyutluyorum
// her sınıftan boylece nesne uretmek zorunda kalmayız
}
