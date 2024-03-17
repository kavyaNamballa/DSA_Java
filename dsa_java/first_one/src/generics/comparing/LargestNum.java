package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNum {
    public static void main(String[] args) {
        String[] array = {"3","30","34","9","5"};
        // output: 9534330
//        Arrays.sort(array, new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return Integer.parseInt(s)-Integer.parseInt(t1);
//            }
//        });
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return -1*(s+t1).compareTo(t1+s);
            }
        });
        System.out.println(Arrays.toString(array));
        StringBuilder out = new StringBuilder();
        for (String str:array){
            out.append(str);
        }
        System.out.println(out);


    }
}
