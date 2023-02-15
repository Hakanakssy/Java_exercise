import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Welcome to loops2 if you input odd number loop will be break");
            int num, base=0;
            boolean handbrake=false;
            String numbers=" ";
            
   do {
            System.out.println("Please input number;");
            num=read.nextInt();
   if (num%2==0 && num%4==0) {
            base=base+num;
   }
   else if (num%2==1) {
            System.out.println("You did input odd number");
            handbrake=true;
            
   }
   numbers=numbers+num+", ";
   }
   while (handbrake==false); {
            System.out.println("Output of total: "+base);
            System.out.println("Your numbers: "+numbers);
   }
        }
    

        

}
}