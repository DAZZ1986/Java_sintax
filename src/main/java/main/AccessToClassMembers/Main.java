package main.AccessToClassMembers;

//4
import main.AccessToClassMembers2.EngineType;
//5
import static main.AccessToClassMembers2.MathConstants.PI;
import static main.AccessToClassMembers2.MathConstants.square;
//6
import java.lang.reflect.Field;


public class Main {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //��� ���� �������� � ������ ������

        System.out.println("## 1. ������ ����� ������ ������ (�������)");
        //����� ������ ������ � �������� ������� � ��������� � ��� ������ ����� �����.
        MathUtils mathUtils1 = new MathUtils();	    // ������� ������
        System.out.println(mathUtils1.name);	    // ������ � ����
        mathUtils1.Greeting();	                    // ������ � ������


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 2. ������ ����� ������� � ������� (������������)");
        //���� ���� ��������� (`private`), ������ � ���� �������������� ����� ��������� ������ (`getX()`, `setX()`).
        MathUtils mathUtils2 = new MathUtils();
        mathUtils2.setAge(38);	                    // ������������� ���
        System.out.println(mathUtils2.getAge());    // �������� ���


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 3. ������ ����� ����������� ����� ������ (`static`)");
        //���� ���� ��� ����� ��������� ��� `static`, ��� ����������� ������, � �� �������. ���������� ����� ��� �������� �������, ����� ��� ������.
        System.out.println(MathUtils.PI);	                // ������ � ������������ ����
        System.out.println(MathUtils.add(22,30));    // ������ � ������������ ������


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 4. ������ ����� ������ ������ (`import`)");
        //���� ����� ��������� � ������ ������, ��� ����� �������������.
        EngineType engineType = new EngineType();   // ��� �������� ������� ����� ��� �������������
        System.out.println(engineType.engineModel);	// ������ � ����


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 5. ������ ����� ����������� ������ ������ (`import static`)");
        //��������� ������������� ����������� ���� � ������, ����� ������������ �� ��� �������� ������.
        System.out.println(PI); 		    // ���������� ��� MathConstants
        System.out.println(square(5)); 	// ���������� ��� MathConstants


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 6. ������ ����� ��������� (`java.lang.reflect`)");
        //��������� �������� ������ � ��������� ����� � ������� � runtime (������������ � �����������).
        Secret secret = new Secret();
        Field field = Secret.class.getDeclaredField("password");
        field.setAccessible(true);                  	// ������ ��������� ���� ���������
        String password = (String) field.get(secret);
        System.out.println("Password: " + password);


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 7. ������ ����� ������������ (`extends`)");
        //�������� ����� ����� ���������� � `protected` � `public` ������ ������������� ������.
        Zoo zoo = new Zoo();
        zoo.display();


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 8. ������ ����� ���������� (`default`-������)");
        //� Java 8+ ���������� ����� ����� `default`-������, ������� ����� �������� � ��������.
        User user = new User();
        user.Greeter();


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 9. ������ ����� `super` (������������ �����)");
        //�������� ����� `super` ��������� ���������� � ������ ������������� ������.
        Cars cars = new Cars();
        cars.printTypes();


    }

}
