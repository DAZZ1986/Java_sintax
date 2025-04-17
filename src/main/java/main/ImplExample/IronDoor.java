package main.ImplExample;

public class IronDoor extends Door {

    //Уровень защиты определен только для железных дверей
    private int protectionLvl;
    private int price;



    public IronDoor(int price, int protectionLvl) {
        this.price = price;
        this.protectionLvl = protectionLvl;
    }





    //Переопределяем метод из суперкласса
    @Override
    public void forBaseDoor() {
        System.out.println("Base door is doing something");
    }

    //Переопределяем методы из интерфейсов
    @Override
    public void open() {
        System.out.println("The IRON door is opened");
    }
    @Override
    public void close() {
        System.out.println("The IRON door is closed");
    }
}
