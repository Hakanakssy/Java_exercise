import java.util.Scanner;

public class us_al {
static Double us (Double taban, Double kuvvet) {
 double resu = Math.pow(taban, kuvvet);
 System.out.println(taban + " ^ " + kuvvet + " : " + resu);
 return  resu;
}
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("ÜSLÜ SAYI HESAPLAMA");
        while (true) {
            System.out.print("alt sayı : ");
            double as = scanner.nextDouble();
            System.out.print("üs sayı : ");
            double us = scanner.nextDouble();
            us(as, us);
            System.out.println("-----");
}
    }
}
}