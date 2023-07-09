package interfaces;


public class MySqlCustomerdal implements ICustomerDal {

    @Override 
    public void Add() {
        System.out.println("veritabanına kaydoldu.");
    }
}