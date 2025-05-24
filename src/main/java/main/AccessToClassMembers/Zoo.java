package main.AccessToClassMembers;

public class Zoo extends Animal {


    void display() {
        System.out.println("Animal: " + name);	// Доступ к protected-полю класса Animal
    }

}
