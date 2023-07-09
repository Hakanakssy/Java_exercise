import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Welcome, please input your number;");
            int sayi=read.nextInt();
            int sonuc=0;
            String yazi=" ";
            for (int i = 0; i <= sayi; i++) {
                if (i%3==0) {
                    yazi=yazi+" "+i;
                    sonuc=sonuc+i; 
                }
                else if (i%4==0) {
                    yazi=yazi+" "+i;
                    sonuc=sonuc+i;
                }
               
            }
            System.out.println(yazi);
            System.out.println("Sonuc= "+sonuc);
        }

    }
}
