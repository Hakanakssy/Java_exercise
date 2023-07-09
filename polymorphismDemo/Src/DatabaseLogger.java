package polymorphismDemo.Src;

public class DatabaseLogger extends BaseLogger {
    public void Log(String message) {
        System.out.println("Default db  : "+message);
    }
}
