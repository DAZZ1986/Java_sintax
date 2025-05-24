package main.AccessToClassMembers;

public class Cars extends Vehicle {

    String type = "Cars";


    void printTypes() {
        System.out.println("Local type: " + type);          // Car
        System.out.println("Parent type: " + super.type); 	// Vehicle
    }



}
