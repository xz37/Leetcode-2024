package q0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> val2index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (val2index.containsKey(target - nums[i])) {
                return new int[]{val2index.get(target - nums[i]), i};
            } else {
                val2index.put(nums[i], i);
            }
        }
        return null;
    }
}
