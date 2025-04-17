package main.abstr;

public abstract class AbstractAnimalClass {
    int countLeg;
    int weight;
    String color;

    abstract void run();
    abstract void jump();

    public void draw() {    //���������� �� ���������
        System.out.println("Animal is drawing!");
    }
}


