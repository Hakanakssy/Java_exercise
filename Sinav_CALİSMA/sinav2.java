import java.util.Scanner;

public class sinav2 {
    public static void main(String[] args) {
        	
  		Scanner input = new Scanner(System.in);
  
  		
  		System.out.println("Küre Yarıçap değeri girin: ");
  		int r = input.nextInt();
        
        double pi =3.14;
  		double alan=4*pi*r*r;
        double hacim= 4/3*pi*r*r*r;
  		
  		System.out.println("Girilen yarıçap değerine göre; \n------------------------------\nAlan:"+alan+"\nHacim:"+hacim);
  
    }
}
