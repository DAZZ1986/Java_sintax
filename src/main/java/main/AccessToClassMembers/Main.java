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
        //Все виды доступов к членам класса

        System.out.println("## 1. Доступ через объект класса (инстанс)");
        //Самый частый способ — создание объекта и обращение к его членам через точку.
        MathUtils mathUtils1 = new MathUtils();	    // Создаем объект
        System.out.println(mathUtils1.name);	    // Доступ к полю
        mathUtils1.Greeting();	                    // Доступ к методу


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 2. Доступ через геттеры и сеттеры (инкапсуляция)");
        //Если поле приватное (`private`), доступ к нему осуществляется через публичные методы (`getX()`, `setX()`).
        MathUtils mathUtils2 = new MathUtils();
        mathUtils2.setAge(38);	                    // Устанавливаем имя
        System.out.println(mathUtils2.getAge());    // Получаем имя


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 3. Доступ через статические члены класса (`static`)");
        //Если поле или метод объявлены как `static`, они принадлежат классу, а не объекту. Обращаться можно без создания объекта, через имя класса.
        System.out.println(MathUtils.PI);	                // Доступ к статическому полю
        System.out.println(MathUtils.add(22,30));    // Доступ к статическому методу


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 4. Доступ через импорт класса (`import`)");
        //Если класс находится в другом пакете, его нужно импортировать.
        EngineType engineType = new EngineType();   // при создании объекта класс был импортировать
        System.out.println(engineType.engineModel);	// Доступ к полю


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 5. Доступ через статический импорт класса (`import static`)");
        //Позволяет импортировать статические поля и методы, чтобы использовать их без указания класса.
        System.out.println(PI); 		    // Используем без MathConstants
        System.out.println(square(5)); 	// Используем без MathConstants


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 6. Доступ через рефлексию (`java.lang.reflect`)");
        //Позволяет получать доступ к приватным полям и методам в runtime (используется в фреймворках).
        Secret secret = new Secret();
        Field field = Secret.class.getDeclaredField("password");
        field.setAccessible(true);                  	// Делаем приватное поле доступным
        String password = (String) field.get(secret);
        System.out.println("Password: " + password);


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 7. Доступ через наследование (`extends`)");
        //Дочерний класс может обращаться к `protected` и `public` членам родительского класса.
        Zoo zoo = new Zoo();
        zoo.display();


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 8. Доступ через интерфейсы (`default`-методы)");
        //В Java 8+ интерфейсы могут иметь `default`-методы, которые можно вызывать у объектов.
        User user = new User();
        user.Greeter();


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("## 9. Доступ через `super` (родительский класс)");
        //Ключевое слово `super` позволяет обращаться к членам родительского класса.
        Cars cars = new Cars();
        cars.printTypes();


    }

}
