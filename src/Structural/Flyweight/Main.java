package Structural.Flyweight;

interface Employee{
    public void assignSkill(String skill);
    public void task();
}

class Developer implements Employee{

    private final String job;
    private String skill;

    public Developer() {
        this.job = "FIX THE ISSUE";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Developer skill: "+this.skill+" with job: "+job);
    }
}

class Tester implements Employee{

    private final String job;
    private String skill;

    public Tester() {
        this.job = "TEST THE ISSUE";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester skill: "+this.skill+" with job: "+job);
    }
}


class EmployeeFactory{

}

public class Main {
    public static void main(String[] args) {

    }
}
