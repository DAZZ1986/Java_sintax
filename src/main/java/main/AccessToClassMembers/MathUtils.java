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
    static final double PI = 3.1415; 	// ����������� ����

    static int add(int a, int b) { 		// ����������� �����
        return a + b;
    }

    //4
    //������ ����� EngineType (������ ������ � ������ ������ - src/main/java/main/AccessToClassMembers2/EngineType.java)

    //5
    // ������ ����� MathConstants

    //6
    // ������ ����� Secret

    //7
    // ������ ����� Animal, Zoo

    //8
    // ������ ����� User � ��������� Greeter

    //9
    // ������ �����

    //10
    // ������ ����� Vehicle � Cars



}
