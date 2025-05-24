package main;

import main.Exeptions.ExceptionExample;
import main.ImplExample.Door;
import main.ImplExample.IronDoor;
import main.ImplExample.WoodDoor;
import main.ImplExample2.Bmw;
import main.ImplExample2.Car;
import main.ImplExample2.Tesla;
import main.abstr.Cat;
import main.abstr.Dog;
import main.oop.Test;

public class Main {

    public static void main(String[] args) {
/*
        Integer aa = 111;
        System.out.println(aa);
        int a = 0b0010;
        System.out.println(a);
        char aaa = '\u0041';
        System.out.println(aaa);


        final String BRAND = "Volvo";
        System.out.println(BRAND);

        while(a < 11) {
            a++;
            //System.out.println("aaa");
        }

        int key = 123;
        Integer keyObj = key;
        System.out.println(keyObj);

        int b = (int) 3.14;
        System.out.println(b);

        double bb = 2.6;
        int c = (int) (0.5+bb);
        System.out.println(c);

        boolean h = true;
        boolean h2 = false;
        if(h ^ h2) {    // XOR example
            System.out.println("h and h2 - different");
        }

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

        int mark1 = 10;
        int mark2 = 1;

        SomeClass obj1 = new SomeClass();
        int sum = obj1.countSum(mark1, mark2);  //в метод примитивы передаются копии значений

        System.out.println(mark1);  //значение не изменилось
        System.out.println(mark2);  //значение не изменилось
        System.out.println(sum);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

        String[] friends = {"Masha","Sasha","Sergey", "Petr"};
        for (String item:friends)
            System.out.println("I love " + item);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

        int i = 1;
        do {
            i++;
            System.out.println(i);
        } while (i < 0);


        //Стр 66. Концепции ООП


        System.out.println("----------------------");


        //Стр 110. Тип String и операторы
        String greeting = new String("hello");
        System.out.println(greeting);
        System.out.println("allow " + greeting);


        System.out.println("----------------------");


        //Стр 115. StringBuffer
        StringBuffer sb = new StringBuffer("Privet");
        System.out.println("Длина: " + sb.length());

        StringBuffer sb2 = new StringBuffer("Privet");
        System.out.println("Объем памяти: " + sb2.capacity());

        StringBuffer sb3 = new StringBuffer("Cat");
        sb3.setCharAt(1, 'o');  //какой символ и на что влияет
        System.out.println(sb3);


        String str1 = "Cat has ";
        String str2 = " paws";
        int paws = 4;
        StringBuffer sb4 = new StringBuffer(20);
        sb4.append(str1).append(paws).append(str2);
        System.out.println(sb4);


        StringBuffer sb5 = new StringBuffer("I cats");
        sb5.insert(2, "like ");
        System.out.println (sb5); // I like cats

        StringBuffer sb6 = new StringBuffer("АБРАКАДАБРА");
        sb6.reverse();
        System.out.println (sb6); // 22АРБАДАКАРБА11
*/
/*
        System.out.println("----------Перегрузка методов (должны отличаться кол-вом параметров, порядком, типом)---------");

        //создали класс oop->Test
        Test test = new Test();
        double result = test.multiple(2, 2.0223);
        System.out.println(result);

        System.out.println("--------------------");

        //Static - https://vertex-academy.com/tutorials/ru/modifikator-static-v-java/
        Test a1 = new Test();
        a1.stat = 20;
        a1.nonStat = 20;
        System.out.println("a1 static = " + a1.stat);
        System.out.println("a1 non static = " + a1.nonStat);

        a1.stat += 20;
        a1.nonStat += 20;

        Test a2 = new Test();
        System.out.println("a2 static = " + a2.stat);  //тоесть статическая переменная для всех объектов будет одинаковая тк имеет одну область памяти
        System.out.println("a2 non static = " + a2.nonStat);//а обычные переменные у объектов имею разные области памяти и как следствие значения не статич перем у разных объектов будут разными.


        System.out.println("----------Наследование, интерфейсы, protected тест (Door)---------");
        //Что мы тут сделали - мы навешали интерфейсов на главный класс Door, и создали вложенные классы IronDoor,
        //WoodDoor и в этих вложенных классах переопределили методы из интерфейсов которые имплементированы к основному классу Door.
        Door door1 = new Door();
        door1.open();
        door1.close();

        IronDoor ironDoor = new IronDoor(5000, 9);
        ironDoor.open();
        ironDoor.close();

        WoodDoor woodDoor = new WoodDoor(3000, "Dub");
        woodDoor.open();
        woodDoor.close();

        //protected тест
        SmallIronDoor smallIronDoor = new SmallIronDoor();  //
        smallIronDoor.accessProtectedMethod();  // Вызов метода, который обращается к protected методу и доступ возможен только через класс/объект наследника или в одном пакете.
*/

        System.out.println("----------Наследование и интерфейсы (Car)---------");

        Car car1 = new Car("Base");
        car1.getCarModel();

        Bmw bmw1 = new Bmw("X5", 25);
        System.out.println("Car model - " + bmw1.getCarModel());        //вызов метода из класса родителя
        System.out.println("Refill gas tank - " + bmw1.chargeByFuel()); //вызов метода из интерфейса

        Tesla tesla1 = new Tesla("Ineos", 25);
        System.out.println("Car model - " + tesla1.getCarModel());        //вызов метода из класса родителя
        System.out.println("Refill energy - " + tesla1.chargeByEnergy()); //вызов метода из интерфейса
/*
        System.out.println("----------Абстрактные классы---------");
        Cat cat = new Cat();
        cat.draw();     //вызов метода из абстрактного класса родителя
        cat.run();      //вызов переопределенного метода из класса Cat
        cat.jump();

        Dog dog = new Dog();
        dog.draw();    //вызов метода из абстрактного класса родителя
        dog.run();     //вызов переопределенного метода из класса Dog
        dog.jump();
*/



/*
        System.out.println("----------Исключения---------");
        //курс - D:\CODE\Курс\Java\[SW.BAND] [Udemy] Andrey Sumin - Java с нуля до Junior + Подготовка к собеседованию (2020)\оригинальная озвучка

        //try catch
        int a = 1;
        try {
            int b = 7 / a;      //тут ловим исключение тк делить на 0 нельзя
            System.out.println("После исключения весь блок try игнорируется!");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("You can not divide by zero!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Блок finally");     //выполняется всегда, независымо было исключение или нет.
        }
        System.out.println("Privet");


        //try catch and method signature
        //вариант 1 - обработать исключение из метода deepMethod() в блоке try catch
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.execute();
        //вариант 2 - обработать исключение из метода deepMethod() в сигнатуре
        ExceptionExample exceptionExample2 = new ExceptionExample();
        try {
            exceptionExample2.exMethod();
        } catch (Exception e) {

        }
*/
/*
        System.out.println("----------Коллекции---------");

        double a = 12.9;
        String aa = String.valueOf(a);
        System.out.println(a);
        System.out.println(aa);
*/


        System.out.println("----------Отличие ==  и equals()---------");
        int a = 5;
        int b = 5;
        System.out.println(a == b);                     // true

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);               // false (разные адреса в памяти)







/*
        System.out.println(isPalindrome("А в Енисее — синева.") == true);
        System.out.println(isPalindrome("Аргентина манит негра.") == true);
        System.out.println(isPalindrome("Не палиндром") == false);
 */
    }
    /*
        public static boolean isPalindrome(String word) {
            String wordClear = word.replaceAll("[^\\p{L}_0-9]", "");
            wordClear = wordClear.toLowerCase();
            String[] splitArr = wordClear.split("");

            for (String item : splitArr) {
                System.out.println(item);
            }
            System.out.println(isPalindrome("А в Енисее — синева.") == true);

            int lenght = splitArr.length;

            for (int i = 0; i < lenght / 2; i++) {
                String f = splitArr[i];
                String l = splitArr[lenght-1-i];

                if(wordClear.charAt(i) != wordClear.charAt(lenght - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    */

}


