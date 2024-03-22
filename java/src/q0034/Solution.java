package q0034;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ansFirst = -1, ansLast = -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                ansFirst = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                ansLast = mid;
                left = mid + 1;
            }
        }

        return new int[]{ansFirst, ansLast};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] ans = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
