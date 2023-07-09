package classes.src;

public class main {
    public static void main(String[] args) {

        dortIslem yap =new dortIslem();
        int top_sonuc = yap.topla(5, 7);
        int cik_sonuc= yap.cikar(5, 7);
        int carp_sonuc= yap.carp(5, 7);
        int bol_sonuc= yap.bol(5, 7);
        System.out.println("topla: "+top_sonuc);
        System.out.println("Çıakr: "+cik_sonuc);
        System.out.println("Çarp: "+carp_sonuc);
        System.out.println("Bölüm: "+bol_sonuc);
        

    }
}
 