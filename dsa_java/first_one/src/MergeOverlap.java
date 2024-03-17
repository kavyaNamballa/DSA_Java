import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlap {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] out = merge(arr);
        for (int[] ar:out){
            System.out.println(Arrays.toString(ar));
        }
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[][] res = new int[n][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                return (t1[0]<t2[0])?-1:1;
            }
        });
        for (int[] ar:intervals){
            System.out.println(Arrays.toString(ar));
        }
        res[0] = intervals[0];
        int id = 0;
        for(int i = 1;i<n;i++){
            if(intervals[i][0]<res[id][1]){
                res[id][1] = intervals[i][1];
            }else{
                res[++id] = intervals[i];
            }
        }
        return Arrays.copyOfRange(res,0,id+1);
    }
}
