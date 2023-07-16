package kutuphane_bilgi_sis;

public class Kitap {
    public Kitap() {
        
    }
    private String kitap_adi;
    private String kitap_yazari;
    private String kitap_yayinevi;
    private int sayfaSayisi;
    private double fiyat;

    public String getKitap_adi() {
        return kitap_adi;
    }
    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }
    public String getKitap_yazari() {
        return kitap_yazari;
    }
    public void setKitap_yazari(String kitap_yazari) {
        this.kitap_yazari = kitap_yazari;
    }
    public String getKitap_yayinevi() {
        return kitap_yayinevi;
    }
    public void setKitap_yayinevi(String kitap_yayinevi) {
        this.kitap_yayinevi = kitap_yayinevi;
    }
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public void add(Kitap kitap) {
    }

}
