package oop_tekrar.polymorphism;

public class FileLogger extends BaseLogger {
    public void log (String Message){
        System.out.println("File Logger "+Message);
    }
}
