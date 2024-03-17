package oops1.singleton;

import oops1.access.A;
import oops1.singleton.Singleton;

public class Main{

    public static void main(String[] args) {
//        SingleTon obj = new SingleTon();
        //put a debug pointer and observe the objects pointing to which address
        Singleton obj1 = Singleton.getInstance1();
        Singleton obj2 = Singleton.getInstance1();
        Singleton obj3 = Singleton.getInstance1();

        A obj = new A(3,4,5);
        int n = obj.num1;
//        int n = obj.num2; //protected
//        int n = obj.num2; //private

    }
}
