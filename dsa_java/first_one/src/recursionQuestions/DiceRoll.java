package recursionQuestions;

import java.util.Arrays;

public class DiceRoll {
    public static void main(String[] args) {
//        int target = 500,k=30,n = 30;
        int target = 7,n=2,k=6;
        System.out.println(find(0,target,n,k));
        dice("",4);
    }
    static int find(int p,int target,int n,int k){
        if(n<0 || target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        int c = 0;
        for(int i = 1;i<=k;i++) {
            c += find(p + i, target-i, n - 1, k);
        }
        return c;
    }

    // no of possibilities rolling a dice to get target on face
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }
}
