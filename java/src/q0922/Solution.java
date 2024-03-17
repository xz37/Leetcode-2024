package q0922;

import java.util.Arrays;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0, odd = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[even] = num;
                even += 2;
            } else {
                ans[odd] = num;
                odd += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,1,1,1,1,2,2,2,2,2,2};
        int[] ans = solution.sortArrayByParityII(nums);
        System.out.println(Arrays.toString(ans));
    }
}
