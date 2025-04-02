package main.ImplExample;

public class WoodDoor extends Door {

    //Характеристика "порода древесины" доступна только деревянной двери
    private String woodType;
    private int price;



    public WoodDoor(int price, String woodType) {
        this.price = price;
        this.woodType = woodType;
    }






    //Переопределяем методы из интерфейсов
    @Override
    public void open() {
        System.out.println("The WOOD door is opened");
    }
    @Override
    public void close() {
        System.out.println("The WOOD door is closed");
    }
}
