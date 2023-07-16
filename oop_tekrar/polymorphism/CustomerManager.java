package oop_tekrar.polymorphism;

public class CustomerManager {
    private BaseLogger baseLogger;
    // Constructor injection (Dependency Injection) ile logger nesnesini oluşturur ve atar.
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
        this.baseLogger.log("Log Mesajı");
    }
}
