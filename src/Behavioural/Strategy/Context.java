package Behavioural.Strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return this.strategy.doOperations(num1,num2);
    }
}
