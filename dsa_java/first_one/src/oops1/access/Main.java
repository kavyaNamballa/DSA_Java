package oops1.access;

import java.util.ArrayList;

public class Main extends A{

    public Main(int num1, int num2, int num3) {
        super(num1, num2, num3);
    }

    public static void main(String[] args) {
        A obj  = new A(3,4,5);
        //1. access the data and modify the data
//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY; // since it's a private variable cannot be accessed

        int n = obj.num2;
        int n2 = obj.num1;
//        int n3 = obj.num3; //private
    }
}
