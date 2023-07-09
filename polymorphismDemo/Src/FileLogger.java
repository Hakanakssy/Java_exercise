package polymorphismDemo.Src;

/**
 * FileLogger
 */
public class FileLogger extends BaseLogger  {
    public void Log(String message) {
        System.out.println("Default file  : "+message);
    }
    
}