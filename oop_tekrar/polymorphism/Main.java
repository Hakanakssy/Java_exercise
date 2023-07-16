package oop_tekrar.polymorphism;

public class Main {
    public static void main(String[] args) {
        // BaseLogger[] baseLogger = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger() };
        // for (BaseLogger logger:baseLogger){
        //     logger.Log("Log Mesajı");
        // }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
