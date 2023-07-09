package Hello;
public class CalisanMain {
public static void main(String[] args) {

//Calisan c= new Calisan ("Ali","a@mail.com","05221110011"); // alt sınıfta hata veriyor , Akademisyen alt sınıfına bakalım
Asistan a=new Asistan ("Ayşe","aa@mail.com","05274110011","ybs","hoca","sql");

a.getAdSoyad();
//c.getEposta();

System.out.println(a.getAdSoyad());
//System.out.println(c.getEposta());
a.derseGir();

OgretimUyesi o = new OgretimUyesi ("Ahmet","ahm@mail.com","05471110011","ybs","hoca","c++");
o.derseGir(); // yukarıdan asagıya kalıtım
// 1.calisan - 2.akademisyen - 3.asistan ve ogretim uyesi sınıfları 
//c.giris ();
//a.giris();
//m.giris();
Akademisyen ak= new Akademisyen ("Ali","a@mail.com","05221110011","ybs","hoca","java");
ak.getTelefon();
System.out.println(ak.getTelefon());
//POLYMORPHISM : COK BICIMLILIK
//Calisan c=new Akademisyen ("Ali","a@mail.com","05221110011","ybs","hoca","java");
// alt sınıfı oldugu icin nesne uretebildik
// cok bicimlilik icin en onemli kriter : kalıtım olması yani alt sınıf olması
// c Akademisyen gibi kabul edilir
//System.out.println(c.getAdSoyad());
Calisan c=new OgretimUyesi ("Ahmet","ahm@mail.com","05471110011","ybs","hoca","c++");
// c ogretim uyesi gibi kabul edilir
System.out.println(c.getEposta());
}
}
