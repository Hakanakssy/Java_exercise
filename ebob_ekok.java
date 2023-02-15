import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        int ebob=1, sayi1, sayi2;
        double ekok=0.0;  boolean rw = false;
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Hoşgeldin;");
            System.out.println("gir sayı1");
            sayi1=read.nextInt();
            System.out.println("gir sayı2");
            sayi2=read.nextInt();
        }
        
        do {
            if (sayi1 <= 0 || sayi2 <= 0) {
                System.out.print("Girdiğiniz sayılardan biri negatif. Lütfen pozitif sayı giriniz");
            } else {
                rw = true;
            }
        } while (!rw);


            int i = sayi1;
            while (i >= 1) {
                if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                    System.out.print("Girdiğiniz iki sayının en büyük ortak böleni: " + i);
                    ebob=i;
                    break;
                } else {
                    i--;
                }

            }

        ekok= (sayi1*sayi2)/ebob;
        System.out.println("\nGirdiğiniz iki sayının en küçük ortak katı: "+ekok);
    }
}
