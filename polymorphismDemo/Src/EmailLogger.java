package polymorphismDemo.Src;

public class EmailLogger extends BaseLogger{
    public void Log(String message) {
        System.out.println("Default email  : "+message);
    }
    
}
