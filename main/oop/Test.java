package main.oop;

public class Test {
    public int nonStat = 0;
    public static int stat = 0;

    //���������� �������
    public int multiple(int b) {
        return b;
    }
    public int multiple(int a, int b) {
        return a * b;
    }         //������ ���-�� ����������
    public double multiple(int a, double b) {
        return a * b;
    }   //������ ��� ����������
    public double multiple(double a, int b) {
        return a * b;
    }   //������ ������� ����������
    public int multiple(int a, int b, int c) {
        return a * b * c;
    }

}
