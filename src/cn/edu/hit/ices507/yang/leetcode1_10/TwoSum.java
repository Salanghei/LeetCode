package cn.edu.hit.ices507.yang.leetcode1_10;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            if(numMap.containsKey(target - nums[i])){
                return new int[]{numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
