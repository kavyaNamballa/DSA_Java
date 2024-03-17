package questions;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name="kavya";
        char ch = 'h';
        System.out.println(search(name,ch));
    }
    static boolean search(String str,int ch){
//        str.length() or str.isEmpty()
        if(str.length() == 0){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(ch == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
        for(char c:str.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}
