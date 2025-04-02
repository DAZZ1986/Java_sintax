package main.String;

public class StringGo {


    public static void main(String[] args) {

        char[] chars = {'a','b','c','a',};
        System.out.println("Массив char " + chars.toString());
        String s = new String(chars);
        System.out.println("String на основе массива " + s);

        byte[] bytesData = s.getBytes();
        System.out.println("Для массива выводится ссылка " + bytesData.hashCode());
        String a = new String(bytesData);
        System.out.println("String из массива byte " + a);

        byte[] charb = { 65, 66, 67, 68 };  //Массив byte из чисел
        String b = new String(charb);
        System.out.println("Еще String на основе массива " + b);
        String с = new String(bytesData,0,2);
        System.out.println("String на основе части массива " + с);




    }


}
