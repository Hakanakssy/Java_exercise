import java.util.Scanner;

public class asal_sayi {
    static void asal (int a) {
        int sayac=0;
        for (int i = 1; i < a; i++) {
            if (a%i==0) {
                sayac++;
                
            }
        }
        if (sayac>1) {
            System.out.println("****************************");
            System.out.println("Asal değil");
        }
        else   {
            System.out.println("****************************");
            System.out.println("ASAL");
        }
        System.out.println("****************************");
    }

    public static void main(String[] args) {
       int a;
       try (Scanner read = new Scanner(System.in)) {
        while (true) {
            System.out.println("please input a");
            a=read.nextInt();
            asal(a);
        }
    }
    }

}
