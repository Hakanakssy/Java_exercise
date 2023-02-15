import java.util.Scanner;

public class loops5 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int a,b; int sonuc=1;
            System.out.println("Welcome");
            System.out.println("İnput a");
            a=read.nextInt();
            System.out.println("İnput b");
            b=read.nextInt();

            for (int i = 0; i < b; i++) {
                sonuc=sonuc*a;
            }
            System.out.println("Sonuc: "+sonuc);
        }
    }
}
