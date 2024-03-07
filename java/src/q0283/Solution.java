package q0283;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                if (slow != fast) {
                    nums[fast] = 0;
                }
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,0,1,2,4,2,2,0,4,2,4,30,2,4,2};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
