package interfaces;


public class CustomerManager {
    ICustomerDal customerDal;
    public void Add() {
        customerDal.Add();
    }
}
