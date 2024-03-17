public class SimilarStrs {
    public static void main(String[] args) {
        String text = "monomonmoonnoom";
        String key = "moon";
        for (int i = 0; i < text.length() - key.length() + 1; i++) {
            String temp = text.substring(i, i + key.length());
            if(isSimilar(temp,key)){
                System.out.println(temp);
            }
        }
    }
    public static boolean isSimilar(String a,String key){
        if(a.equals(key)){
            return true;
        }
        int[] count = new int[26];
        int c =0 ;
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i),c2 = key.charAt(i);
            count[c1-'a']++;
            count[c2-'a']--;
            if(c1!=c2){
                if(i>0 && c1==key.charAt(i-1)){
                    c++;
                }else if(i<a.length()-1 && c1==key.charAt(i+1)){
                    c++;
                }else{
                    return false;
                }
            }
        }
        for(int num:count){
            if(num!=0) return false;
        }
        if(c>2) return false;
        return true;
    }
}
