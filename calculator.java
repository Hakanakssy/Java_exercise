import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Welcome to my calculator machinie :D");
            System.out.println("First step, input your numbers. Second step, select your operation with number of transaction.");
            System.out.println("Please input your first number: ");
                double num1=read.nextDouble();
            System.out.println("Please input your second number: ");
                double num2=read.nextDouble();
            System.out.println("Please select your transaction with input the number: ");
            System.out.println("1-Addition (+) \n2-Subtraction (-) \n3-Division (/) \n4-Multiplication (*)"); 
                int process=read.nextInt();
                Double result= 0.0;
            switch (process) {
                case 1:
                    result= num1+num2;   
                    break;
                case 2: 
                    result= num1-num2;
                    break;
                case 3:
                    result= num1/num2;
                    break;
                case 4:
                    result= num1*num2;
                    break;
                default:
                    System.out.println("Please enter a correct transaction number!!!");
                    break;
            }
            System.out.println("Your first number: "+num1+"\nYour second number: "+num2+"\nYour result of transaction: "+result);
        }
    }
}
