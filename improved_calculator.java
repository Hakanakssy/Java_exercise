import java.util.*;

public class improved_calculator {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int a,b,d;

            System.out.println("Welcome!");
            System.out.println("Lütfen işlem yapmak istediğiniz 1. sayıyı giriniz;");
            a=read.nextInt();
            System.out.println("Lütfen işlem yapmak istediğiniz 2. sayıyı giriniz;");
            b=read.nextInt();
   
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz; \n1- Toplama İşlemi \n2- Çıkarma İşlemi \n3- Çarpma İşlemi \n4- Bölme işlemi \n5- Üslü Sayı Hesaplama \n6- Faktoriyel Hesaplama \n7- Mod Alma \n8- Dikdörtgen Alan \n9-Çevre Hesabı");
      d=read.nextInt();
      
            switch (d) {
                case 1:
                    topla(a, b);
                    break;
                case 2:
                    cikar(a, b);
                    break;
                case 3:
                    carp(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    us_al(a, b);
                    break;
                case 6:
                    faktoriyel(a, b);
                    break;
                case 7:
                    mod_al(a, b);
                    break;
                case 8:
                    dortgen_alan(a, b);
                    break;
                case 9:
                    dortgen_cevre(a, b);
                    break;
            
                default:
                    System.out.println("Yanlış bir değer girdiniz");
                    break;
            }
        }

    }
    public static int topla (int a, int b){
        int c=a+b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int cikar (int a, int b){
        int c=a-b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int carp (int a, int b){
        int c=a*b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int bolme (int a, int b){
        int c=a/b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int us_al (int a, int b){
        int c=1;
        for (int i = 1; i <= b; i++) {
            c*=a;
        }
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int faktoriyel (int a, int b){
        int c=1;
        for (int i = a; i >= 1 ; i--) {
            c*=i;
        }
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int mod_al (int a, int b){
        int c=a%b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int dortgen_alan (int a, int b){
        int c = a*b;
        System.out.println("sonuc: "+c);
        return c;
    }
    public static int dortgen_cevre (int a, int b){
        int c= a+b+a+b;
        System.out.println("sonuc: "+c);
        return c;
    }
}
