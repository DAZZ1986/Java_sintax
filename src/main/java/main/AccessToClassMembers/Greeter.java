package main.AccessToClassMembers;

public interface Greeter {



    public default void Greeter() {  // ������ �� ��������� (default methods)
        System.out.println("Hello from interface!");
    }


}
