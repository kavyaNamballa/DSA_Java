package bitwiseMath;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 296;
        System.out.println((int)(Math.log(n&-n)/Math.log(2)));
    }
}
