package main.abstr;

public class Cat extends AbstractAnimalClass {

    @Override
    public void run() {
        System.out.println("Cat running!");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping!");
    }
}
