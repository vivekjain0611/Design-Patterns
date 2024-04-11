package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    //private constructor so that class cannot be created from outside
    private Singleton() {

    }
    // public static method to get only one instance - Lazy initialization
    public static Singleton getInstance() {
        if(uniqueInstance==null) {
            synchronized (Singleton.class){
                if(uniqueInstance==null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
