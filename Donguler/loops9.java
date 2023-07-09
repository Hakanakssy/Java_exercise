import java.util.Scanner;

public class loops9 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int sasa, newsayi=0, sayi1=0, sayi2=0;

            System.out.println("Welcome");
            System.out.println("Kaç tane sayı gireceksinizü;");
            sasa=read.nextInt();
      // System.out.println("input sayi2");
            //sayi2=read.nextInt();

            for (int i = 1; i <= sasa; i++) {
                System.out.print(i+". sayıyı giriniz: ");
                newsayi=read.nextInt();
                if (newsayi > sayi1 && newsayi>0) {
                    sayi1=newsayi;
                }
                else if (newsayi<0 && sayi2>newsayi) {
                    sayi2=newsayi;
                }
            }
        
        System.out.println("En büyük sayı: "+sayi1+"\nEn küçük sayı: "+sayi2);
}
}
}