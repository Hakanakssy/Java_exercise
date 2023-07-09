import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int st,nd,rd; 
                System.out.println("Please input first number; ");
                st=read.nextInt();
                
                System.out.println("Please input second number; ");
                nd=read.nextInt();
                
                System.out.println("Please input third number; ");
                rd=read.nextInt();

                if (st<nd && st<rd && nd<rd) {
                    System.out.println(st+" "+nd+" "+rd);
                }
                else if(st<nd && st<rd && rd<nd){
                    System.out.println(st+" "+rd+" "+nd);
                }
                else if(nd<st && nd<rd && st<rd){
                    System.out.println(nd+" "+st+" "+rd);
                }
                else if(nd<st && nd<rd && rd<st){
                    System.out.println(nd+" "+rd+" "+st);
                }
                else if(rd<st && rd<nd && st<nd){
                    System.out.println(rd+" "+st+" "+nd);
                }
                else if(rd<st && rd<nd && nd<st){
                    System.out.println(rd+" "+nd+" "+st);
                }
        }
    }
}

