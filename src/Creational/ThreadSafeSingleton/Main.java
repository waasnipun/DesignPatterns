package Creational.ThreadSafeSingleton;
//Double checked locking singleton pattern
class Singleton{
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("Instance created!");
    }

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null)
                    singleton = new Singleton();
            }

        }
        return singleton;
    }
}


public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj1 = Singleton.getInstance();
//                System.out.println(obj1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj2 = Singleton.getInstance();
//                System.out.println(obj2);
            }
        });

        t1.start();
        t2.start();
    }

}