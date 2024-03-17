package recursionQuestions;
import java.util.List;
public class LetterCombinations {
    public static void main(String[] args) {

    }
    static void find(String p,String up,List<String> list,String[] dialPad){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int id = ((int)up.charAt(0))-2;
        for(int i = 0;i<dialPad[id].length();i++){
            find(p+dialPad[id].charAt(i),up.substring(1),list,dialPad);
        }
    }
}
