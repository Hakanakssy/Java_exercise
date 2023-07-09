import java.util.*;

public class methods1 {

    static String hello (String a,String b){
        
        String klm= "Hello to "+a+" my little "+b;
        return klm;
    }

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("welco input a");
            String a=read.next();
            System.out.println("now input b");
            String b=read.next();

            System.out.println(hello(a, b));
        }
    }
}
