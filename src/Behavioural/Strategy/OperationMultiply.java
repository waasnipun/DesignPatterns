package Behavioural.Strategy;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperations(int num1, int num2) {
        return num1*num2;
    }
}
