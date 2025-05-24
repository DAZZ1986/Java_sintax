package main.Collections;

import java.util.*;

public class Collections {


    public static void main(String[] args) {

        System.out.println("-------//////////-------�������� �������� ��������� --------//////////-------");
        System.out.println("1) sout:");
        List list00 = new ArrayList();
        list00.add(3);
        list00.add("654");
        System.out.println(list00);

        System.out.println("2) foreach:");
        for (Object item: list00) {
            System.out.println(item);
        }

        System.out.println("3) iterator:"); //https://vkvideo.ru/video-230191111_456242830
        Iterator<Object> iterator = list00.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

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
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Apple");           // �� ����� ����� ������������� ��������

        System.out.println(hashSet); // [Apple, Cherry, Banana]  -  ������� �� ������������ !!!


        System.out.println("--------------LinkedHashSet---------------");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");     // �� ����� ����� ������������� ��������

        System.out.println(linkedHashSet); // [Banana, Apple, Cherry]  -  ������� ���������� �������� !!!

        //System.out.println("--------------TreeSet---------------");
        //System.out.println("--------------CopyOnWriteArraySet---------------");




        System.out.println("-------//////////-------Queue/Deque--------//////////-------");

        System.out.println("--------------Queue/LinkedList ---------------");
        Queue<String> queue = new LinkedList<>();
        queue.add("A"); // ��� offer()
        queue.add("B");
        queue.add("C");

        System.out.println(queue.poll()); // "A" (�������)
        System.out.println(queue.peek()); // "B" (�� �������)
        System.out.println(queue); // [B, C]

        System.out.println("--------------FIFO (First-In-First-Out) � �������� �������������� � ������� ����������.---------------");
        //�������� ����������:
        //- ArrayDeque � ����� ���������������� ������������ LinkedList.
        //- PriorityQueue � ������� � �����������.
        //- LinkedList � ������� �������.
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("A"); // ��� offerLast()
        deque.addLast("B");
        deque.addLast("C");

        System.out.println(deque.removeFirst()); // "A" (pollFirst())
        System.out.println(deque); // [B, C]


        System.out.println("--------------����� �������� ��� ���� (LIFO) ��� ������� (FIFO).---------------");
        //�������� ����������:
        //- ArrayDeque � ������� ���������� �� �������.
        //- LinkedList � ����� ����������������, �� ������.
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A"); // addFirst()
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop()); // "C" (removeFirst())
        System.out.println(stack); // [B, A]
    }


}
