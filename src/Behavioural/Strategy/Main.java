package Behavioural.Strategy;

//class behavior or its algorithm can be changed at run time.

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 x 5 = "+context.executeStrategy(10,5));
    }
}
