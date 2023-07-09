import java.util.Scanner;
/**
 * sinav1
 */
public class sinav1 {

    public static void main(String[] args) {
        

     
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {
			System.out.println(sayi+" çift bir sayıdır.");
		}else {
			System.out.println(sayi +" tek bir sayıdır.");
		}

    }       
}