package main.ImplExample;

public class WoodDoor extends Door {

    //�������������� "������ ���������" �������� ������ ���������� �����
    private String woodType;
    private int price;



    public WoodDoor(int price, String woodType) {
        this.price = price;
        this.woodType = woodType;
    }






    //�������������� ������ �� �����������
    @Override
    public void open() {
        System.out.println("The WOOD door is opened");
    }
    @Override
    public void close() {
        System.out.println("The WOOD door is closed");
    }
}
