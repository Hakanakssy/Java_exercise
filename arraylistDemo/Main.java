package arraylistDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Hello");
        // System.out.println(sayilar.get(2));
        // System.out.println(sayilar.get(1));
        // sayilar.set(1,100);
        // System.out.println(sayilar.get(1));
        // sayilar.remove(0);//0. index silindi fakat diğer elemanlar boşluğu kapatmak için kaydırıldı.
        // System.out.println(sayilar.get(0));//burada alacağımız değer remove işleminden önceki 1. index olur.

        for (Object i  : sayilar) {
            System.out.println(i);
        }

    }
}
