
public class loops13 {
   public static void main(String[] args) {

   
    for(int i=1; i < 100; i++) {
        int say = 0;
        for(int j=1; j <= i; j++) {
            if(i % j == 0) {
                say++;
            }
        }
        if(say == 2) {
            System.out.print(i +" ");
        }
     }
    }
}    


