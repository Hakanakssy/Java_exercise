package oop_tekrar.polymorphism;

public class ConsoleLogger extends BaseLogger {
    public void log (String Message){
        System.out.println("Console Logger "+Message);
    }
}
