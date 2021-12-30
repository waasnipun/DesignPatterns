package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

abstract class Account{
    public abstract float getBalance();
}

class DepositAccount extends Account{
    private String accountNo;
    private float accountBalance;

    public DepositAccount(String accountNo, float accountBalance){
        super();
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
}

class SavingsAccount extends Account{
    private String accountNo;
    private float accountBalance;

    public SavingsAccount(String accountNo, float accountBalance){
        super();
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }
}

//Mixing of two individual classes
class CompositeAccount extends Account{

    private float totalBalance;
    private List<Account> accountList = new ArrayList<Account>();

    @Override
    public float getBalance() {
        totalBalance = 0;
        for (Account f: accountList){
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }
    public void addAccount(Account acc){
        accountList.add(acc);
    }
    public void removeAccount(Account acc){
        accountList.remove(acc);
    }
}



public class Client {
    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();

        component.addAccount(new DepositAccount("DA001",100));
        component.addAccount(new DepositAccount("DA002",300));
        component.addAccount(new SavingsAccount("SA001",1000));

        float totalBalance = component.getBalance();
        System.out.println("Total Balance: "+totalBalance);
    }
}
