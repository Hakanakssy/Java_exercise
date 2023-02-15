import java.util.Scanner;

public class tempature {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Please input weather tempature; ");
            int temp=read.nextInt();

            if(temp<5){
                System.out.println("You can go out to ski");
            }
            else if(temp >=5 && temp<=15){
                System.out.println("You can go out to cinema ");
            }
            else if(temp >=15 && temp<=25){
                System.out.println("You can go out to picnic");
            }
            else{
                System.out.println("You can go out to swim");
            }
        }
    }
}
