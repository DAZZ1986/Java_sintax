package main.oop;

public class Test {
    public int nonStat = 0;
    public static int stat = 0;

    //Перегрузка методов
    public int multiple(int b) {
        return b;
    }
    public int multiple(int a, int b) {
        return a * b;
    }         //разное кол-во параметров
    public double multiple(int a, double b) {
        return a * b;
    }   //разный тип параметров
    public double multiple(double a, int b) {
        return a * b;
    }   //разный порядок параметров
    public int multiple(int a, int b, int c) {
        return a * b * c;
    }

}
