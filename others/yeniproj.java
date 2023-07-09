public class yeniproj {
    public static void main(String[] args) {
        String mesaj = "Bugün hava güzel";
        String yenimesaj=  sehirver();
        System.out.println(yenimesaj);
        int sayi = topla(5,7);
        int toplam =topla2(2,3,5,6,7,8,9,10,11);
        System.out.println(toplam);
        
    }

    public static void ekle() {
        System.out.println("eklendi");

    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("guncellendi");
    }

    public static int topla(int a, int b) {
        int c = a+b;
        return c;
    }

    public static int topla2(int... sayilar) {
        int toplam=0;
        for (int sayi: sayilar) {
            toplam+=sayi;
        }
           return toplam;  
    }

    public static String sehirver() {
        return "Ankara";
    }

}
