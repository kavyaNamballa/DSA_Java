package recursion;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(sum(9355));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
}
