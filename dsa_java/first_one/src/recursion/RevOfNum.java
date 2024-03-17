package recursion;

public class RevOfNum {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 12043;
        rev(n);
        System.out.println();
        rev1(n);
        System.out.println(sum);
        System.out.println("rev "+rev3(n,(int)Math.log10(n)));
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        rev(n/10);
    }
    static void rev1(int n){
        if(n==0) return;
        sum = sum*10+(n%10);
        rev1(n/10);
    }
    static int rev3(int n,int arg){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,arg) + rev3(n/10,arg-1);
    }
}
