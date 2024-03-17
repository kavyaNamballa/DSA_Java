package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsNeetCode {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        permut(numList, new ArrayList<>());
        return res;
    }

    private void permut(List<Integer> nums, List<Integer> tempList) {
        if (nums.isEmpty()) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            tempList.add(num);
            nums.remove(i);
            permut(nums, tempList);
            nums.add(i, num);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        PermutationsNeetCode obj = new PermutationsNeetCode();
        System.out.println(obj.permute(new int[]{1,2,3}));
    }
}

