package linkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(3,100);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        list.insertRec(2,88);
//        list.display();

        SortLL li = new SortLL();
        li.insertLast(1);
        li.insertLast(2);
        li.insertLast(3);
        li.insertLast(4);
        li.insertLast(5);

        li.display();
//        li.mergeSort();
//        li.bubbleSort();
//        System.out.println(li.find());
        li.reverse();
        li.display();
        Stack<Integer> stack = new Stack<>();  //stack is a class
        Queue<Integer> queue;  // queue is an interface
//        queue = new Queue<Integer>() {
//        };

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
    }
}
