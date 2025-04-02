package main.ImplExample;


import main.Main;

public class Door implements Openable, Closeble {

    //Допустим, что у любой двери есть цена
    protected int price;










    //protected тест
    protected void protectionMethodDoor() {
        System.out.println("protected тест. (доступ к методу protectionMethodDoor() из класса Door, получили из метода " +
                "accessProtectedMethod() из класса SmallIronDoor который находится в другом пакете)");
    }

    //override Переопределим у наследника
    public void forBaseDoor() {
        System.out.println("Base door is doing something");
    }

    //private Этот метод доступен исключительно в классе Door
    public void forRegularDoor() {
        System.out.println("Regular door is doing something");
    }

    //Реализованные методы из интерфейсов
    @Override
    public void open() {
        System.out.println("Дверь открыть.");
    }

    @Override
    public void close() {
        System.out.println("Дверь закрыть.");
    }
}
