package main.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections {


    public static void main(String[] args) {

        System.out.println("-------//////////-------List--------//////////-------");
        //�	����������� ������������� �������� - ��
        //�	�������� � ������ �������� � ��� �������, � ������� ��� ���� ���������� - ��
        //� ������ � �������� �� ������� - ��
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");            //�������� ������������� ��.
        stringList.add("b");
        stringList.add("c");
        for (String item: stringList) {
            System.out.println(item);       //��� ������, ������� ��. ��������(��� ��� ����������)
        }
        System.out.println("����� ��. �� �������: " + stringList.get(2));   //����� ��. �� �������


        System.out.println("--------------ArrayList---------------");
        //�	- ������ � ������� ������ ArrayList - ok
        //�	- ������������ ������ - ��
        //�	- ������ � �������� �� ������� (O(1)) - ��
        //�	- ��������� �������/�������� � �������� (O(n)) - ��
        //�	- ������� ��������� ����� ���, � ������� �� �� ���� ��������� - ok
        //�	- ��������� ������� � �������� �������� ����� ������, ������� null - ok
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.ensureCapacity(10);        //�	- ������ � ������� ������ ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1, 999);   //��������� �������/�������� � �������� (O(n)) -
        arrayList.add(null);                    //�	- ��������� ������� � �������� �������� ����� ������, ������� null.
        try {
            for (int item : arrayList) {
                System.out.println(item);       //�	- ������� ��������� ����� ���, � ������� �� �� ���� ���������
            }
        } catch (NullPointerException e) {}
        System.out.println("����� ��. �� �������: " + stringList.get(2));   //������ � �������� �� ������� (O(1))

        System.out.println("--------------��������� �������/�������� � �������� (O(n))---------------");
        // ������� ��������: ����� �� ��������� ����� ������� �� ������ 5, ��� �������� � ����� ������� � ����
        // ������ ���� �������� ������, ����� ���������� ����� ��� ������ ��������. ��� ������� O(n) �������.
        // ������� ArrayList � ��������� ��� ����������
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("������� " + i);
        }

        System.out.println("�������� ������: " + list);

        // ������� �������� � �������� ������ (O(n))
        list.add(5, "����� �������"); // ��������� �� ������ 5
        System.out.println("������ ����� �������: " + list);

        // �������� �������� �� �������� ������ (O(n))
        String removedElement = list.remove(5); // ������� ������� �� ������� 5
        System.out.println("��������� �������: " + removedElement);
        System.out.println("������ ����� ��������: " + list);



        System.out.println("--------------LinkedList---------------");
        //�	- ������ � ������� ������ LinkedList - ok
        //�	- ���������� ������ - ok
        //�	- ������ �� ������� O(n)  (���� linkedList.get(10), �� ����� ���������� ��� �� 0 �� 10, ������� O(n)) - ok
        //�	- ������� �������/�������� � �������� (O(n)) - ok
        //�	- ������� ��������� ����� ���, � ������� �� �� ���� ��������� - ok
        //�	- �������/�������� �� ������ � ����� ������ �� O(1) - ok
        //�	- ��������� ������� ����� ������, ������� null - ok
        String str1 = new String("str1-Hello World!");
        String str2 = new String("str2-My name is Earl");
        String str3 = new String("str3-I love Java");

        LinkedList<String> linkedList = new LinkedList<>();
        //linkedList.spliterator();     //�	- ������ � ������� ������ LinkedList
        linkedList.add(null);           //�	- ��������� ������� ����� ������, ������� null.
        linkedList.add(str1);
        linkedList.add(str3);
        linkedList.add(1, str2);  //�	- ���������� � �������� �� �������� O(n)
        linkedList.remove(2);     //�	- ���������� � �������� �� �������� O(n)
        for (String item: linkedList) {
            System.out.println(item);           //�	- ������� ��������� ����� ���, � ������� �� �� ���� ��������� - ok
        }

        System.out.println("����� ��. �� �������: " + linkedList.get(1));   //�	- ������ �� ������� O(n)  (���� linkedList.get(10), �� ����� ���������� ��� �� 0 �� 10, ������� O(n))

        linkedList.addFirst("First el.");    //�	- �������/�������� �� ������ � ����� ������ �� O(1) - ok
        linkedList.removeFirst();               //�	- �������/�������� �� ������ � ����� ������ �� O(1) - ok
        linkedList.addFirst("Last el.");     //�	- �������/�������� �� ������ � ����� ������ �� O(1) - ok
        linkedList.removeLast();                //�	- �������/�������� �� ������ � ����� ������ �� O(1) - ok

        System.out.println("--------------������� �������/�������� � �������� (O(n))---------------");
        // ������� LinkedList � ��������� ��� ����������
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list2.add("������� " + i);
        }

        System.out.println("�������� ������: " + list2);

        // ������ � �������� �� ������� 5 (O(n))
        // � ���� ������� �� ������ �������� ���� �� ������� 5
        String elementAtIndex5 = list2.get(5);
        System.out.println("������� �� ������� 5: " + elementAtIndex5);

        // ������� ������ �������� ����� ��������� �� ������� 5 (O(1))
        list2.add(5, "����� �������"); // ��������� �� ������ 5
        System.out.println("������ ����� �������: " + list2);

        // �������� �������� �� ������� 5 (O(1))
        String removedElement2 = list2.remove(5); // ������� ������� �� ������� 5
        System.out.println("��������� �������: " + removedElement2);
        System.out.println("������ ����� ��������: " + list2);






        System.out.println("-------//////////-------Set--------//////////-------");


        System.out.println("--------------HashSet---------------");


        System.out.println("--------------LinkedHashSet---------------");


        System.out.println("--------------TreeSet---------------");


        System.out.println("--------------CopyOnWriteArraySet---------------");




    }


}
