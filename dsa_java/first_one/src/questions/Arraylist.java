package questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        //Initialization
//        list.add(10);
//        list.add(10);
//        list.add(10);
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        int ch = 'a'^'a';
        System.out.println(list); // automatically calls toString method in arraylist
    }
}
