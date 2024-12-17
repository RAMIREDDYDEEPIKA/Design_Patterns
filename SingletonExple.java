class Logger
{
    private static Logger instance;

    private Logger(){
        System.out.println("This is logger class");
    }

    public static Logger getInstance(){

        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public static void log(String message){
        System.out.println("log method called :"+message);
    }
}

public class SingletonExple {

    public static void main(String[] args) {

        Logger logger1=Logger.getInstance();
        logger1.log("first log method");

        Logger logger2=Logger.getInstance();
        logger2.log("second log method");

        System.out.println("Is obj1 and obj2 are stored same reference : "+(logger1==logger2));
    }
}