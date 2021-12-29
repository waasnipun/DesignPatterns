package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(List<String> list){
        this.vehicleList = list;
    }

    public void insertData(){
        vehicleList.add("Honda");
        vehicleList.add("Civic");
        vehicleList.add("Hyundai");
    }

    public List<String> getVehicleList(){
        return this.vehicleList;
    }


    @Override
    public Vehicle clone() {
        List<String> temp = new ArrayList<String>();
        temp.addAll(this.getVehicleList());
        return new Vehicle(temp);
    }

}
public class Main {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        a.insertData();

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("New HONDA");

        System.out.println(a.getVehicleList());
        System.out.println(list);

        b.getVehicleList().remove("Civic");

        System.out.println(a.getVehicleList());
        System.out.println(list);
    }
}
