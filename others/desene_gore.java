import java.util.Scanner;       


public class desene_gore {
    public static int dus (int a, int b) {
        
        if (a<=0 ) {
            for (int i = a+5; i <= b; i+=5) {
                
                System.out.print(" "+i);
            }
            return 0;
        }
        else if (a>0  )   {
            a=a-5;
        }

            System.out.print(" "+a);
        return dus(a,b);
    }

    

    public static void main(String[] args) {
       try (Scanner read = new Scanner(System.in)) {
        int a, b;
       System.out.println("Welcome please input your number;");
       a=read.nextInt();
       b=a;
       System.out.println("N sayısı: "+a);
        System.out.print("Çıktısı: "+a); dus(a,b);
    }
    }

}


/*if (a<=0 ) {
            a=a+5;
        }
        else if (a>0  )   {
            a=a-5;
        } */