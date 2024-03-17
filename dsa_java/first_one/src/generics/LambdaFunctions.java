package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
//        list.forEach(item -> System.out.println(item*2));
        Consumer<Integer> fun = item -> System.out.println(item * 2);
        list.forEach(fun);

        // lambda expression is an instance of a functional interface
//        Operation res = (Integer i) -> { return "hello" + i;} ;
//        System.out.println(res.op(3));
        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        System.out.println("sum: "+sum.op2(2,3));

    }
}
interface Operation{
//    String op(Integer i);
    int op2(int a,int b);
}
