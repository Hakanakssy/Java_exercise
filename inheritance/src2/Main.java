package inheritance.src2;

public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager krediManager = new OgretmenKrediManager();
        // krediManager.Hesapla();
        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

    }
}
