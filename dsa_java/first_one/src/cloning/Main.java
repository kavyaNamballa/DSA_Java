package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kavya = new Human(19,"Kavya Namballa");
        // this is a lot of processing as we need to use new keyword to create clone of an object
//        Human twin1 = new Human(kavya);

        Human twin = (Human)kavya.clone();
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kavya.arr));

    }
}
