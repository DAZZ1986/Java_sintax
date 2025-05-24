package main.AccessToClassMembers;

public interface Greeter {



    public default void Greeter() {  // методы по умолчанию (default methods)
        System.out.println("Hello from interface!");
    }


}
