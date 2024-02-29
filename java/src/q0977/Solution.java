package q0977;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (left <= right) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                ans[i++] = (int) Math.pow(nums[left++], 2);
            } else {
                ans[i++] = (int) Math.pow(nums[right--], 2);
            }
        }
        reverse(ans);
        return ans;
    }

    private void reverse(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-4,-1,0,3,10};
        int[] res = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}
