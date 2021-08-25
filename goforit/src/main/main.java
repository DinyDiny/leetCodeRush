package main;

import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3};
        int target = 4;
        twoSum2(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i) {
            for(int j = 0; j < nums.length; ++j) {
                if (i != j && target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap();

        for(int i = 0; i < nums.length; ++i) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = (Integer)hash.get(nums[i]);
                return indexs;
            }

            hash.put(target - nums[i], i);
        }

        return indexs;
    }
}
