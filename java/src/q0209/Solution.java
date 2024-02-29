package q0209;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int res = solution.minSubArrayLen(target, nums);
        System.out.println(res);
    }
}

