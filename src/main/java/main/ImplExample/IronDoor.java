package main.ImplExample;

public class IronDoor extends Door {

    //������� ������ ��������� ������ ��� �������� ������
    private int protectionLvl;
    private int price;



    public IronDoor(int price, int protectionLvl) {
        this.price = price;
        this.protectionLvl = protectionLvl;
    }





    //�������������� ����� �� �����������
    @Override
    public void forBaseDoor() {
        System.out.println("Base door is doing something");
    }

    //�������������� ������ �� �����������
    @Override
    public void open() {
        System.out.println("The IRON door is opened");
    }
    @Override
    public void close() {
        System.out.println("The IRON door is closed");
    }
}
