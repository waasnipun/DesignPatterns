package Creational.Singleton;

class SingletonEagar{

    private static SingletonEagar instance = new SingletonEagar();

    private SingletonEagar(){}

    public static SingletonEagar getInstance(){
        return instance;
    }

}

class Singleton{

    private static Singleton instance;


    private Singleton(){
        System.out.println("instance created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}

public class Main {

    public static void main(String[] args) {

        Singleton instance_1 = Singleton.getInstance();
        System.out.println(instance_1);


        Singleton instance_2 = Singleton.getInstance();
        System.out.println(instance_2);

    }

}