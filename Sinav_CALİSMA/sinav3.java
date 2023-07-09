import java.util.Scanner;

public class sinav3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int sayi1=input.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2=input.nextInt();

        if (sayi1>sayi2) {System.out.println("sayi 1, sayi 2 den büyüktür");}
        else if (sayi2>sayi1) {System.out.println("sayi 2, sayi 1 den büyüktür");}
        else   {System.out.println("Her iki sayı birbirine eşittir.");}

    }
}
