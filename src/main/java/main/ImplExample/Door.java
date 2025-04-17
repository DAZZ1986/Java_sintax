package main.ImplExample;


import main.Main;

public class Door implements Openable, Closeble {

    //��������, ��� � ����� ����� ���� ����
    protected int price;










    //protected ����
    protected void protectionMethodDoor() {
        System.out.println("protected ����. (������ � ������ protectionMethodDoor() �� ������ Door, �������� �� ������ " +
                "accessProtectedMethod() �� ������ SmallIronDoor ������� ��������� � ������ ������)");
    }

    //override ������������� � ����������
    public void forBaseDoor() {
        System.out.println("Base door is doing something");
    }

    //private ���� ����� �������� ������������� � ������ Door
    public void forRegularDoor() {
        System.out.println("Regular door is doing something");
    }

    //������������� ������ �� �����������
    @Override
    public void open() {
        System.out.println("����� �������.");
    }

    @Override
    public void close() {
        System.out.println("����� �������.");
    }
}
