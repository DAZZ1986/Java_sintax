package main.String;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hello, World";
        System.out.println(s1.toUpperCase());

        String s2 = s1.replace('o', 'a');
        System.out.println(s2);
        System.out.println(s2.charAt(1));

        int i;
        i = s1.length();
        System.out.println(i);
        i = s1.indexOf('f');
        System.out.println(i);
        i = s1.indexOf('r');
        System.out.println(i);
        i = s1.lastIndexOf('f');
        System.out.println(i);
        i = s1.indexOf('t');
        System.out.println(i);
        i = s1.indexOf('r', 3);
        System.out.println(i);
        System.out.println(s1.substring(4, 8));     //выводит символы с 4 по 8 индекс не включительно.







    }

}
