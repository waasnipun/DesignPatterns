package Structural.Flyweight;

import java.util.HashMap;
import java.util.Random;

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

//Minimizes the object creation
class EmployeeFactory{
    private static HashMap<String, Employee> m = new HashMap<String, Employee>();

    public static Employee getEmployee(String type){
        Employee p = null;
        if(m.get(type)!=null){
            p = m.get(type);
        }
        else{
            switch (type){
                case "Developer":
                    System.out.println("Developer created!");
                    p = new Developer();
                    break;
                case "Tester":
                    System.out.println("Tester created!");
                    p = new Tester();
                    break;
                default:
                    System.out.println("No such Employee!");
            }
            m.put(type,p);
        }
        return p;
    }
}

//client method
public class Main {

    private static String employeeType[] = {"Developer", "Tester"};
    private static String skills[] = {"Java", "C++", "Python", ".Net"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Employee e = EmployeeFactory.getEmployee(getRandEmployee());
            e.assignSkill(getRandSkill());
            e.task();
        }
    }

    public static String getRandEmployee(){
        Random r = new Random();
        int randInt = r.nextInt(employeeType.length);
        return employeeType[randInt];
    }

    public static String getRandSkill(){
        Random r = new Random();
        int randInt = r.nextInt(skills.length);
        return skills[randInt];
    }

}
