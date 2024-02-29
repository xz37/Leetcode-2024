package q0027;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
            } else {
                nums[left] = nums[right--];
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solution.removeElement(nums, val));
    }
}
