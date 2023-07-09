import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int a,b,c, sonuc;
            int d=1,e=1,f=1;
            
            System.out.println("welcome ");
            System.out.println("input a");
            a=read.nextInt();
            System.out.println("input b");
            b=read.nextInt();
            c=a-b;
            
            for (int i = a; i > 0; i--) {
            d=d*i;
            }
            for (int i = b; i >0; i--) {
            e=e*i;
            }
            for (int i = c; i > 0; i--) {
            f=f*i;
            }

            sonuc=d/(e*f);
        
        System.out.println("Sonuc: "+sonuc);
    }
    }
}
