package recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subseqAscii("","abc",new ArrayList<>()));
//        System.out.println(subseqStore("","abc"));
    }
    static void subseq(String p,String up){ //p-processed string ,up-unprocessed string
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseqStore(String p, String up){ //p-processed string ,up-unprocessed string
        if(up.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqStore(p+ch,up.substring(1));
        ArrayList<String> right = subseqStore(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqAscii(String p,String up,ArrayList<String> li){ //p-processed string ,up-unprocessed string
        if(up.isEmpty()){
            li.add(p);
            return li;
        }
        char ch = up.charAt(0);

        subseqAscii(p+ch,up.substring(1),li);
        subseqAscii(p,up.substring(1),li);
        subseqAscii(p+(ch+0),up.substring(1),li);
        return li;
    }

}
