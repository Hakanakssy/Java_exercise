import java.util.Scanner;

/**
 * burctakvimi
 */
public class burctakvimi {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int day, month;
            
            System.out.println("Welcome burçcu");
            System.out.println("Lütfen doğduğunuz ayın numarasını giriniz;");
            month=read.nextInt();
            System.out.println("lütfen doğduğunuz günü giriniz; ");
            day=read.nextInt();

            if(month==1){
                if (day<=21){
                    System.out.println("oğlak");
                }
                else if(day>21 && day<=30){
                    System.out.println("kova");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==2){
                if (day<=19){
                    System.out.println("kova");
                }
                else if(day>19 && day<=28){
                    System.out.println("Balık");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==3){
                if (day<=20){
                    System.out.println("Balık");
                }
                else if(day>20 && day<=31){
                    System.out.println("Koç");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==4){
                if (day<=20){
                    System.out.println("Koç");
                }
                else if(day>20 && day<=30){
                    System.out.println("Boğa");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==5){
                if (day<=21){
                    System.out.println("Boğa");
                }
                else if(day>21 && day<=31){
                    System.out.println("İkizler");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==6){
                if (day<=22){
                    System.out.println("İkizler");
                }
                else if(day>22 && day<=30){
                    System.out.println("Yengeç");
                } else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }  
            }
            if(month==7){
                if (day<=23){
                    System.out.println("Yengeç");
                }
                else if(day>23 && day<=31){
                    System.out.println("Aslan");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==8){
                if (day<=23){
                    System.out.println("Aslan");
                }
                else if(day>23 && day<=30){
                    System.out.println("Başak");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==9){
                if (day<=22){
                    System.out.println("Başak");
                }
                else if(day>22 && day<=31){
                    System.out.println("Terazi");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==10){
                if (day<=22){
                    System.out.println("Terazi");
                }
                else if(day>22 && day<=30){
                    System.out.println("Akrep");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==11){
                if (day<=21){
                    System.out.println("Akrep");
                }
                else if(day>21 && day<=31){
                    System.out.println("Yay");
                }else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
            if(month==12){
                if (day<=22){
                    System.out.println("Yay");
                }
                else if(day>22 && day<=30){
                    System.out.println("Oğlak");
                }
                else if (day<31) {
                    System.out.println("Tarihi hatalı girdiniz");
                }
            }
        }
    }
    
}