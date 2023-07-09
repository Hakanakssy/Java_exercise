import java.util.Scanner;

public class sinav4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Giriniz :");

     int n = input.nextInt();
        int toplam = 1;
        for(int i = 1; i <= n; i++){
            toplam = toplam * i;
        }
        System.out.print(n + "! : " + toplam);

    }
}
