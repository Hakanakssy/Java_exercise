package polymorphismDemo.Src;

public class Main {
    public static void main(String[] args) {
        // EmailLogger logger = new EmailLogger();
        // logger.Log("Log Mesajı "); 

        // BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        // for (BaseLogger baseLogger : loggers) {
        //     logger.Log("Log mesajı");
        // }
            CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
            customerManager.Add();

    }
}
