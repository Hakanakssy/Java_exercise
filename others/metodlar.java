import java.util.Scanner;;

/**
 * metodlar
 */
public class metodlar {

    // ? TOPLAMALAR

    // 4 sayılı toplama
    public static int topla(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4;
        return sum;
    }

    // 3 sayılı toplama
    public static int topla(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    // 2 sayılı toplama
    public static int topla(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // ? ÇIKARMALAR

    // 4 sayılı çıkarma
    public static int cikar(int num1, int num2, int num3, int num4) {
        int diff = num1 - num2 - num3 - num4;
        return diff;
    }

    // 3 sayılı çıkarma
    public static int cikar(int num1, int num2, int num3) {
        int diff = num1 - num2 - num3;
        return diff;
    }

    // 2 sayılı çıkarma
    public static int cikar(int num1, int num2) {
        int diff = num1 - num2;
        return diff;
    }

    // ? ÇARPMALAR

    // 4 sayılı çarpma
    public static double carp(double num1, double num2, double num3, double num4) {
        double multip = num1 * num2 * num3 * num4;
        return multip;
    }

    // 3 sayılı çarpma
    public static double carp(double num1, double num2, double num3) {
        double multip = num1 * num2 * num3;
        return multip;
    }

    // 2 sayılı çarpma
    public static double carp(double num1, double num2) {
        double multip = num1 * num2;
        return multip;
    }

    // ? BÖLÜMLER

    // 4 sayılı bölme
    public static int bol(int num1, int num2, int num3, int num4) {
        int bol = num1 / num2 / num3 / num4;
        return bol;
    }

    // 3 sayılı bölme
    public static int bol(int num1, int num2, int num3) {
        int bol = num1 / num2 / num3;
        return bol;
    }

    // 2 sayılı bölme
    public static int bol(int num1, int num2) {
        int bol = num1 / num2;
        return bol;
    }

    // ? ÜSLÜ SAYI ALMA

    // bir sayının 4.kuvveti
    public static double us(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    // ? FAKTORİYEL

    // bir sayının faktoriyeli
    public static int faktoriyel(int num1) {
        int vanil = num1;
        for (int i = num1 - 1; i > 0; i--) {
            vanil = vanil * i;
        }
        return vanil;
    }

    // ? MOD ALMA

    // bir sayının başka bir sayıya modunu alma
    public static int mod(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }

    // ? DİKDÖRTGEN ALAN - ÇEVRE

    // dikdörtgen alan
    public static double dikt_alan(double num1, double num2) {
        return carp(num1, num2);
    }

    // dikdörtgen çevre
    public static double dikt_cevre(double num1, double num2) {
        double result = (num1 * 2) + (num2 * 2);
        return result;
    }

    // işlem seçimi
    public static int[] Hesapla() {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Kaç adet sayı ile işlem yapacaksın?");
            int param = read.nextInt();
            int[] values = new int[4];

            if (param == 1) {
                System.out.println("Sayı 1 giriniz ");
                values[0] = read.nextInt();
                return values;
            } else if (param == 2) {
                System.out.println("Sayı 1 giriniz ");
                values[0] = read.nextInt();
                System.out.println("Sayı 2 giriniz");
                values[1] = read.nextInt();
                return values;
            } else if (param == 3) {
                System.out.println("Sayı 1 giriniz ");
                values[0] = read.nextInt();
                System.out.println("Sayı 2 giriniz");
                values[1] = read.nextInt();
                System.out.println("Sayı 3 giriniz");
                values[2] = read.nextInt();
                return values;
            } else if (param == 4) {
                System.out.println("Sayı 1 giriniz ");
                values[0] = read.nextInt();
                System.out.println("Sayı 2 giriniz");
                values[1] = read.nextInt();
                System.out.println("Sayı 3 giriniz");
                values[2] = read.nextInt();
                System.out.println("Sayı 4 giriniz");
                values[3] = read.nextInt();
                return values;
            } else {
                System.out.println("Lütfen 1 ile 4 arasında numerik bir değer giriniz");
                return values;
            }
        }

    }

    public static void main(String[] args) {

        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Hesap Makinesine Hoşgeldin...");
            System.out.println("Burada en fazla 4 tane sayıyla dört işlem yapabilirsin");
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");

            String islem = read.next();

            switch (islem) {
                case "1":
                    int[] toplamaSayilari = Hesapla();
                    if (toplamaSayilari.length == 1) {
                        System.out.println("tek sayı ile toplama yapılmaz!!!");
                        break;
                    } else {
                        int toplamSonuc = topla(toplamaSayilari[0], toplamaSayilari[1], toplamaSayilari[2],
                                toplamaSayilari[3]);
                        System.out.println("Toplama Sonucu: " + toplamSonuc);
                    }
                    break;
                case "2":
                    int[] cikarmaSayilari = Hesapla();
                    int cikarmaSonuc = cikar(cikarmaSayilari[0], cikarmaSayilari[1], cikarmaSayilari[2],
                            cikarmaSayilari[3]);
                    System.out.println("Çıkarma Sonucu: " + cikarmaSonuc);
                    break;
                case "3":
                    int[] carpmaSayilari = Hesapla();
                    double carpmaSonuc = carp(carpmaSayilari[0], carpmaSayilari[1], carpmaSayilari[2],
                            carpmaSayilari[3]);
                    System.out.println("Çarpma Sonucu: " + carpmaSonuc);
                    break;
                case "4":
                    int[] bolmeSayilari = Hesapla();
                    int bolmeSonuc = bol(bolmeSayilari[0], bolmeSayilari[1], bolmeSayilari[2], bolmeSayilari[3]);
                    System.out.println("Bölme Sonucu: " + bolmeSonuc);
                    break;
                case "5":
                    System.out.println("Üssünü almak istediğiniz sayıyı girin: ");
                    double taban = read.nextDouble();
                    System.out.println("Üssünü girin: ");
                    double us = read.nextDouble();
                    double usSonuc = us(taban, us);
                    System.out.println("Üslü Sayı Sonucu: " + usSonuc);
                    break;
                case "6":
                    System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı girin: ");
                    int sayi = read.nextInt();
                    int faktoriyelSonuc = faktoriyel(sayi);
                    System.out.println("Faktoriyel Sonucu: " + faktoriyelSonuc);
                    break;
                case "7":
                    System.out.println("Modunu almak istediğiniz sayıyı girin: ");
                    int modSayisi = read.nextInt();
                    System.out.println("Mod değerini girin: ");
                    int modDegeri = read.nextInt();
                    int modSonuc = mod(modSayisi, modDegeri);
                    System.out.println("Mod Sonucu: " + modSonuc);
                    break;
                case "8":
                    System.out.println("Dikdörtgenin ilk kenarını girin: ");
                    double kenar1 = read.nextDouble();
                    System.out.println("Dikdörtgenin ikinci kenarını girin: ");
                    double kenar2 = read.nextDouble();
                    double alan = dikt_alan(kenar1, kenar2);
                    double cevre = dikt_cevre(kenar1, kenar2);
                    System.out.println("Dikdörtgen Alanı: " + alan);
                    System.out.println("Dikdörtgen Çevresi: " + cevre);
                    break;
                case "0":
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Lütfen 0 ile 8 arasında numerik bir değer giriniz");
                    break;
            }
        }
    }
}