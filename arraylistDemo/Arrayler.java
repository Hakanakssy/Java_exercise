package arraylistDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayler {
    public static void main(String[] args) {
        ArrayList <String> sehirler = new ArrayList <String>();

        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");
        sehirler.add("Adana");
        

        sehirler.remove("İstanbul");

        Collections.sort(sehirler);

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }

    }
}
