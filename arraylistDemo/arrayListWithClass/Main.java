package arraylistDemo.arrayListWithClass;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList <Customer> customers = new ArrayList <Customer> (); 

        customers.add(new Customer(1,"Hakan", "Aksoy"));
        customers.add(new Customer(2,"Furkan", "Aksoy"));
        customers.add(new Customer(3,"Ahmet", "Aksoy"));

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
