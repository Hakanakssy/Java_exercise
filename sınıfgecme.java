import java.util.Scanner;

public class sınıfgecme {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int mat, fiz, kim, tur, muzik;
            int n=5;
            System.out.println("Matematik notunuzu giriniz;");
             mat= read.nextInt();
             n= mat !=0 ? n+0:n-1;   
             System.out.println("Fizik notunuzu giriniz;");
             fiz= read.nextInt();
             n= fiz !=0 ? n+0:n-1;

            System.out.println("Kimya notunuzu giriniz;");
             kim= read.nextInt();
             n= kim !=0 ? n+0:n-1;

            System.out.println("Türkçe notunuzu giriniz;");
             tur= read.nextInt();
             n= tur !=0 ? n+0:n-1;

            System.out.println("Müzik notunuzu giriniz;");
             muzik= read.nextInt();
             n= muzik !=0 ? n+0:n-1;
               
             Double ortalama= (double) ((mat+fiz+kim+tur+muzik)/n);
             
             if (ortalama<55){System.out.println("Kaldınız: "+ortalama);}
             else {System.out.println("Geçtiniz: "+ortalama);}
        }
        catch (ArithmeticException hepsisifir) {
            
            System.out.println("Kaydını sildir bro");
        }
        
    }
}
