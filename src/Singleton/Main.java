package Singleton;

class SingletonEagar{

    private static SingletonEagar instance = new SingletonEagar();

    private SingletonEagar(){}

    public static SingletonEagar getInstance(){
        return instance;
    }

}

class Singleton{

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }



}

public class Main {

    public static void main(String[] args) {

        SingletonEagar instance_1 = SingletonEagar.getInstance();
        System.out.print(instance_1);

        SingletonEagar instance_2 = SingletonEagar.getInstance();
        System.out.println(instance_2);

    }

}