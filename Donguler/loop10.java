import java.util.Scanner;
public class loop10 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Bir Sayı Giriniz : ");
            int sayi1 = read.nextInt();
            int total=0 ;

            for (int i = 1 ; i <= sayi1 ; i++){
                if (sayi1 % i == 0){
                    total +=i;
                }
            }
            total -= sayi1;
            if (total == sayi1){
                System.out.println(sayi1 + " Mükemmel Bir Sayıdır.");
            }else {
                System.out.println(sayi1 + " Mükemmel Bir Sayı Değildir.");
            }
        }

    }
}
