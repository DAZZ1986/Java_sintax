package main.String;

public class StringGo {


    public static void main(String[] args) {

        char[] chars = {'a','b','c','a',};
        System.out.println("������ char " + chars.toString());
        String s = new String(chars);
        System.out.println("String �� ������ ������� " + s);

        byte[] bytesData = s.getBytes();
        System.out.println("��� ������� ��������� ������ " + bytesData.hashCode());
        String a = new String(bytesData);
        System.out.println("String �� ������� byte " + a);

        byte[] charb = { 65, 66, 67, 68 };  //������ byte �� �����
        String b = new String(charb);
        System.out.println("��� String �� ������ ������� " + b);
        String � = new String(bytesData,0,2);
        System.out.println("String �� ������ ����� ������� " + �);




    }


}
