import java.util.Scanner;

public class loops7 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            double har,seri=0.0;
            System.out.println("Welcome input harmonic");
            har=read.nextInt();
            for (double i = 1; i <= har; i++) {
                seri += (1/i);
                //System.out.println(seri);
            }
        
        System.out.println("Sonuç: "+seri);
    }
}
}