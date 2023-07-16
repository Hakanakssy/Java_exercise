package oop_tekrar.polymorphism;

public class DatabaseLogger extends BaseLogger {
    public void log (String Message){
        System.out.println("DB Logger "+Message);
    }
}
