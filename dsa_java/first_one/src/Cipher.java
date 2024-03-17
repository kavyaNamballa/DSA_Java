public class Cipher {
    public static void main(String[] args) {
        String str = "k3Cb4ghIn6hjigk";
        int max = 0,c=0;
        boolean flag = false;
        int e = 0,i;
        for(i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                if(flag){
                    if(max<c){
                        max = c;
                        e = i-1;
                    }
                }
                c=0;
                flag = false;
            }else{
                c++;
                if(ch>='A' && ch<='Z'){
                    flag = true;
                }
            }
        }
        if(flag) {
            if (max < c) {
                max = c;
                e = i - 1;
            }
        }
        System.out.println(max+" "+e);
        if(c!=0) {
            System.out.println(str.substring(e - max+1, e+1));
        }
    }
}
