import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int num;
            String kat4=" ", kat5=" ";
            
            System.out.println("Hoşgeldin!");
            num=read.nextInt();
            for (int i = 0; i <= num; i++) {
                if (i%4==0) {
                   kat4=kat4+i+", ";
                }
                else if (i%5==0) {
                    kat5=kat5+i+", ";
                }
            }
            System.out.println("4' ün katları: "+kat4);
        
        System.out.println("5' in katları: "+kat5);
    }
}
}