package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        System.out.println(permut("","abc"));
//        ArrayList<String> li = new ArrayList<>();
//        permutStore("","abc",li);
//        System.out.println(li);
//        System.out.println(permutCount("","abcd"));
        System.out.println(getPermutation(3,2));
    }
    public static String getPermutation(int n, int k) {
        List<String> li = new ArrayList<>();
        permut("",1,n,li);
        System.out.println(li);
        return li.get(k-1);
    }
    public static void permut(String p,int i,int n,List<String> li){
        if(i==n+1){
            li.add(p);
            return;
        }
        for(int j=p.length();j>=0;j--){
            permut(p.substring(0,j)+(char)(i+'0')+p.substring(j),i+1,n,li);
        }
    }
    static ArrayList<String> permut(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> str = new ArrayList<>();
            //            System.out.println(p);
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
//        for (int i = 0; i < p.length()+1;i++) {
//            ans.addAll(permut(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
//        }
        for (int i = p.length(); i >=0 ;i--) {
            ans.addAll(permut(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
        }
        return ans;
    }

    static void permutStore(String p,String up,ArrayList<String> li){
        if(up.isEmpty()){
            li.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1;i++) {
            permutStore(p.substring(0,i)+ch+p.substring(i),up.substring(1),li);
        }
        int[][] arr = {{1,2,3},{3,4,5}};
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return 0;
            }
        });
    }

    static int permutCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1;i++) {
            count = count + permutCount(p.substring(0,i)+ch+p.substring(i),up.substring(1));
        }
        return count;
    }
}
