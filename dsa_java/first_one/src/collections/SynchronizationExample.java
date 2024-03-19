package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SynchronizationExample {
    public static void main(String[] args) {
        // Creating an ArrayList and a Vector
        List<Integer> arrayList = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        // Creating and starting multiple threads to modify both ArrayList and Vector concurrently
        Runnable arrayListTask = () -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        };

        Runnable vectorTask = () -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        };

        // Creating and starting multiple threads
        Thread thread1 = new Thread(arrayListTask);
        Thread thread2 = new Thread(vectorTask);
        thread1.start();
        thread2.start();

        try {
            // Waiting for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the sizes of ArrayList and Vector
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Vector size: " + vector.size());
    }
}
