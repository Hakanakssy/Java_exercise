


public class polindrom_number {
    public static void main(String[] args) {
       
        System.out.println(is_pali(12345));
    }
    
    static boolean is_pali (int number_input) {
        int temp=number_input, reverse_number=0, lastnumber;
        while (temp != 0) {
            lastnumber= temp %10;
            reverse_number= (reverse_number*10)+lastnumber;
            temp/=10;
        }
        if (number_input==reverse_number) 
        return true;
        else   
        return false;
    }
    
}
