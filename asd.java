import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int deg1=  read.nextInt();
        int deg2= read.nextInt();
        int ortalama;
        ortalama = (deg1+deg2)/2>60 ? 0 : 1;
    //  değişken_ismi= boolean_değer ? true : false;
        System.out.println(ortalama);
    }
}
