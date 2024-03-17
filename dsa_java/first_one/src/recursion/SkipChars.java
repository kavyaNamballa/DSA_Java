package recursion;

public class SkipChars {
    public static void main(String[] args) {
//        skip("baabcds",new StringBuilder(),0);
//        System.out.println(skip2("baabcds",0));
//        skip3("baabcds","");
//        System.out.println(skip4("baabcds"));
        System.out.println(skipApple("bderapple"));
    }
    //two approaches
    static void skip(String str,StringBuilder ans,int i){
        if(str==null || i==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)=='a'){
            skip(str,ans,i+1);
        }
        else {
            ans.append(str.charAt(i));
            skip(str, ans, i + 1);
        }
    }

    static String skip2(String str,int i){
        if(str==null || i==str.length()){
            return "";
        }
        if(str.charAt(i)!='a'){
            return str.charAt(i) + skip2(str,i+1);
        }
        return skip2(str,i+1);
    }
    //without passing i
    static void skip3(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            skip3(str.substring(1),ans);
        }
        else{
            skip3(str.substring(1),ans+ch);
        }
    }

    //without passing ans array in argument
    static String skip4(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        String s1="";
        if(ch!='a'){
            s1 += ch;
        }
        String s2 = skip4(str.substring(1));
        s1+=s2;
        return s1;
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        return str.charAt(0) + skipApple(str.substring(1));
    }
}
