package Hello;
public class OgretimUyesi extends Akademisyen {
String bolum, gorevler ;
String ders;
public OgretimUyesi (String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
super(adSoyad, eposta, telefon, bolum, gorevler, ders);
this.bolum = bolum;
this.gorevler = gorevler;
this.ders = ders;
}
}

