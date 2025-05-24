package main.Collections;

import java.util.*;

public class Collections {


    public static void main(String[] args) {

        System.out.println("-------//////////-------Варианты перебора коллекций --------//////////-------");
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
        //•	допускаются повторяющиеся элементы - ок
        //•	элементы в списке хранятся в том порядке, в котором они туда помещались - ок
        //• доступ к элементу по индексу - ок
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");            //добавлен повторяющийся эл.
        stringList.add("b");
        stringList.add("c");
        for (String item: stringList) {
            System.out.println(item);       //при выводе, порядок эл. соблюден(как при добавлении)
        }
        System.out.println("Вывод эл. по индексу: " + stringList.get(2));   //вывод эл. по индексу


        System.out.println("--------------ArrayList---------------");
        //•	- доступ к методам класса ArrayList - ok
        //•	- динамический массив - ок
        //•	- доступ к элементу по индексу (O(1)) - ок
        //•	- медленная вставка/удаление в середине (O(n)) - ок
        //•	- порядок элементов будет тот, в котором мы их туда добавляли - ok
        //•	- позволяет хранить в качестве элемента любые данные, включая null - ok
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.ensureCapacity(10);        //•	- доступ к методам класса ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1, 999);   //Медленные вставка/удаление в середине (O(n)) -
        arrayList.add(null);                    //•	- позволяет хранить в качестве элемента любые данные, включая null.
        try {
            for (int item : arrayList) {
                System.out.println(item);       //•	- порядок элементов будет тот, в котором мы их туда добавляли
            }
        } catch (NullPointerException e) {}
        System.out.println("Вывод эл. по индексу: " + stringList.get(2));   //Доступ к элементу по индексу (O(1))

        System.out.println("--------------медленная вставка/удаление в середине (O(n))---------------");
        // Вставка элемента: Когда мы вставляем новый элемент на индекс 5, все элементы с этого индекса и выше
        // должны быть сдвинуты вправо, чтобы освободить место для нового элемента. Это требует O(n) времени.
        // Создаем ArrayList и заполняем его элементами
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Элемент " + i);
        }

        System.out.println("Исходный список: " + list);

        // Вставка элемента в середину списка (O(n))
        list.add(5, "Новый элемент"); // Вставляем на индекс 5
        System.out.println("Список после вставки: " + list);

        // Удаление элемента из середины списка (O(n))
        String removedElement = list.remove(5); // Удаляем элемент на индексе 5
        System.out.println("Удаленный элемент: " + removedElement);
        System.out.println("Список после удаления: " + list);



        System.out.println("--------------LinkedList---------------");
        //•	- доступ к методам класса LinkedList - ok
        //•	- двусвязный список - ok
        //•	- доступ по индексу O(n)  (если linkedList.get(10), то будет перебирать все от 0 до 10, поэтому O(n)) - ok
        //•	- быстрая вставка/удаление в середине (O(n)) - ok
        //•	- порядок элементов будет тот, в котором мы их туда добавляли - ok
        //•	- вставка/удаление из начала и конца списка за O(1) - ok
        //•	- позволяет хранить любые данные, включая null - ok
        String str1 = new String("str1-Hello World!");
        String str2 = new String("str2-My name is Earl");
        String str3 = new String("str3-I love Java");

        LinkedList<String> linkedList = new LinkedList<>();
        //linkedList.spliterator();     //•	- доступ к методам класса LinkedList
        linkedList.add(null);           //•	- позволяет хранить любые данные, включая null.
        linkedList.add(str1);
        linkedList.add(str3);
        linkedList.add(1, str2);  //•	- добавление и удаление из середины O(n)
        linkedList.remove(2);     //•	- добавление и удаление из середины O(n)
        for (String item: linkedList) {
            System.out.println(item);           //•	- порядок элементов будет тот, в котором мы их туда добавляли - ok
        }

        System.out.println("Вывод эл. по индексу: " + linkedList.get(1));   //•	- доступ по индексу O(n)  (если linkedList.get(10), то будет перебирать все от 0 до 10, поэтому O(n))

        linkedList.addFirst("First el.");    //•	- вставка/удаление из начала и конца списка за O(1) - ok
        linkedList.removeFirst();               //•	- вставка/удаление из начала и конца списка за O(1) - ok
        linkedList.addFirst("Last el.");     //•	- вставка/удаление из начала и конца списка за O(1) - ok
        linkedList.removeLast();                //•	- вставка/удаление из начала и конца списка за O(1) - ok

        System.out.println("--------------быстрая вставка/удаление в середине (O(n))---------------");
        // Создаем LinkedList и заполняем его элементами
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list2.add("Элемент " + i);
        }

        System.out.println("Исходный список: " + list2);

        // Доступ к элементу на индексе 5 (O(n))
        // В этом примере мы просто получаем узел на индексе 5
        String elementAtIndex5 = list2.get(5);
        System.out.println("Элемент на индексе 5: " + elementAtIndex5);

        // Вставка нового элемента перед элементом на индексе 5 (O(1))
        list2.add(5, "Новый элемент"); // Вставляем на индекс 5
        System.out.println("Список после вставки: " + list2);

        // Удаление элемента на индексе 5 (O(1))
        String removedElement2 = list2.remove(5); // Удаляем элемент на индексе 5
        System.out.println("Удаленный элемент: " + removedElement2);
        System.out.println("Список после удаления: " + list2);






        System.out.println("-------//////////-------Set--------//////////-------");


        System.out.println("--------------HashSet---------------");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Apple");           // не может иметь повторяющиеся значения

        System.out.println(hashSet); // [Apple, Cherry, Banana]  -  порядок не гарантирован !!!


        System.out.println("--------------LinkedHashSet---------------");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");     // не может иметь повторяющиеся значения

        System.out.println(linkedHashSet); // [Banana, Apple, Cherry]  -  порядок добавления сохранен !!!

        //System.out.println("--------------TreeSet---------------");
        //System.out.println("--------------CopyOnWriteArraySet---------------");




        System.out.println("-------//////////-------Queue/Deque--------//////////-------");

        System.out.println("--------------Queue/LinkedList ---------------");
        Queue<String> queue = new LinkedList<>();
        queue.add("A"); // или offer()
        queue.add("B");
        queue.add("C");

        System.out.println(queue.poll()); // "A" (удаляет)
        System.out.println(queue.peek()); // "B" (не удаляет)
        System.out.println(queue); // [B, C]

        System.out.println("--------------FIFO (First-In-First-Out) — элементы обрабатываются в порядке добавления.---------------");
        //Основные реализации:
        //- ArrayDeque — более производительная альтернатива LinkedList.
        //- PriorityQueue — очередь с приоритетом.
        //- LinkedList — базовая очередь.
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("A"); // или offerLast()
        deque.addLast("B");
        deque.addLast("C");

        System.out.println(deque.removeFirst()); // "A" (pollFirst())
        System.out.println(deque); // [B, C]


        System.out.println("--------------Может работать как стек (LIFO) или очередь (FIFO).---------------");
        //Основные реализации:
        //- ArrayDeque — быстрая реализация на массиве.
        //- LinkedList — менее производительная, но гибкая.
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A"); // addFirst()
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop()); // "C" (removeFirst())
        System.out.println(stack); // [B, A]
    }


}
