package oops1.singleton;

import oops1.access.A;

public class Subclass extends A {
    public Subclass(int num1, int num2, int num3) {
        super(num1, num2, num3);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(3,4,5);
        int n = obj.num2;
        A obj2 = new A(3,4,5);
//        int n2 = obj2.num2(); // can be accesses only bi its subclass object

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof Object);

        System.out.println(obj.getClass());
    }
}
