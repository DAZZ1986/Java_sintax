package main.abstr;

public class Dog extends AbstractAnimalClass {

    @Override
    public void run() {
        System.out.println("Dog running!");
    }

    @Override
    public void jump() {
        System.out.println("Dog jumping!");
    }
}
