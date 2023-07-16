package oop_tekrar.polymorphism;

public class EmailLogger extends BaseLogger {
    public void log (String Message){
        System.out.println("Email Logger "+Message);
    }
}
