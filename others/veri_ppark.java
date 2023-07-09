
import java.util.Scanner;/**
 * veri_ppark
 */
public class veri_ppark {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        int sayi, n;
        System.out.println("Sisteme hoşgeldin lütfen n sayısını giriniz");
        n=read.nextInt();
       ;
        for (int i = 0; i <= n; i++) {
            
             if (i%3==0 &&  i%5==0) {
                System.out.println("Veripark");
            }
            else if (i%3==0) {
                System.out.println("veri");
            }   
            else if (i%5==0) {
                System.out.println( "Park");
            }
            
            else   {System.out.println(i);}
        }
    }
}