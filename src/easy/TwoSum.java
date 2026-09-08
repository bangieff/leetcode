package easy;

import java.util.*;

/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if(numMap.containsKey(need)) {
                result[0] = i;
                result[1] = numMap.get(need);
                return result;
            }
            else {
                numMap.put(nums[i], i);
            }
        }

        return result;
    }
}
