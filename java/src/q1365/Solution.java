package q1365;

import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] times = new int[101];
        for (int num : nums) {
            times[num]++;
        }
        int lastTime = times[0];
        times[0] = 0;
        for (int i = 1; i < 101; i++) {
            int curTime = times[i];
            times[i] = times[i - 1] + lastTime;
            lastTime = curTime;
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = times[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new  int[]{5,0,10,0,10,6};
        int[] ans = solution.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
}
