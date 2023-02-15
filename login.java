import java.util.Scanner;
   

public class login {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Hello, welcome to my login screen! İf your already have account input '1'\nIf you haven't account input '2' for create account :D");
            int acc= read.nextInt();
                String username= "none" ;
                String password= "none" ;
                
                switch (acc) {
                    case 1:
                        //login screen
                    System.out.println("Please input your username; ");
                    String user1=read.next();
                    System.out.println("Plase input your password;  ");
                    String pass1=read.next();
                        if (user1.equals(username) && pass1.equals(password)){
                            System.out.println("Welcome!!!");
                        }
                        else{
                            System.out.println("Wrong password or username please check and login again!");
                        }
                        break;
                    case 2: 
                        //register screens
                        System.out.println("Please input your new user name;");
                         String changename=read.next();
                         switch (changename) {
                            case "none":
                                System.out.println("This is your last used name :D?");
                                break;
                         
                            default:
                            username  =changename;
                                break;
                         }
                        System.out.println("Please input your new password;");
                         String changepassword=read.next();
                        switch (changepassword) {
                            case "none":
                                System.out.println("This is your last used password :D?");
                                break;
                         
                            default:
                            password  =changepassword;
                                break;
                         }
                        System.out.println("Change succesfully completed");
                            //login screen
                            System.out.println("Please input your username; ");
                             user1=read.next();
                            System.out.println("Plase input your password;  ");
                             pass1=read.next();
                        if (user1.equals(username) && pass1.equals(password)){
                            System.out.println("Welcome!!!");
                        }
                        else{
                            System.out.println("Wrong password or username please check and login again!");
                        }
                        break;
                            
                    default:
                        System.out.println("kod kontrol!!!");
                        break;
                }
        }

    }
}


