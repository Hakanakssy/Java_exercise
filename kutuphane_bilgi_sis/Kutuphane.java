package kutuphane_bilgi_sis;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> Kitap;

    public Kutuphane() {
        Kitap = new ArrayList<>();
    }

    public void kitapEkle(Kitap Kitap) {
        Kitap.add(Kitap);
        System.out.println("Kitap başarıyla eklendi: " + Kitap.getKitap_adi());
    }

    public void KitapiListele() {
        if (Kitap.isEmpty()) {
            System.out.println("Kütüphane boş.");
        } else {
            System.out.println("Kütüphanedeki Kitap:");
            for (Kitap kitap : Kitap) {
                System.out.println(kitap.getKitap_adi() + " - " + kitap.getKitap_yazari());
            }
        }
    }

    public void kitapAra(String kitapAdi) {
        boolean bulundu = false;
        for (Kitap kitap : Kitap) {
            if (kitap.getKitap_adi().equalsIgnoreCase(kitapAdi)) {
                System.out.println("Kitap bulundu:");
                System.out.println("Kitap Adı: " + kitap.getKitap_adi());
                System.out.println("Yazar: " + kitap.getKitap_yazari());
                System.out.println("Yayınevi: " + kitap.getKitap_yayinevi());
                bulundu = true;
                break;
            }
        }
        if (!bulundu) {
            System.out.println("Kitap bulunamadı.");
        }
    }
}
