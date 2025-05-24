package main.AccessToClassMembers;

public class MathUtils {
    //1
    String name = "Alice";

    void Greeting() {
        System.out.println("Hello, " + name);
    }

    //2
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //3
    static final double PI = 3.1415; 	// Статическое поле

    static int add(int a, int b) { 		// Статический метод
        return a + b;
    }

    //4
    //создан класс EngineType (должен лежать в другом пакете - src/main/java/main/AccessToClassMembers2/EngineType.java)

    //5
    // создан класс MathConstants

    //6
    // создан класс Secret

    //7
    // создан класс Animal, Zoo

    //8
    // создан класс User и интерфейс Greeter

    //9
    // создан класс

    //10
    // создан класс Vehicle и Cars



}
