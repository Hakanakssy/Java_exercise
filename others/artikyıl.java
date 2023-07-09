import java.util.Scanner;
public class artikyıl {
    
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Hello! Welcome to leap year");
            System.out.println("Please input year");
            int year=read.nextInt();
            int md= year%10==0 ? year%400: year%4; 
            //int kontrol = year%10==0 ? 1: 0;
            if (md==0) {
                System.out.println("This is a leap year");
            }
            else   {
                System.out.println("This isn't leap year");
            }
        }
    
    }
    
    
}
