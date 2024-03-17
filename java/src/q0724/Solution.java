package q0724;

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = sum;
            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (left[i] == sum - nums[i] - left[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,1,-1};
        int ans = solution.pivotIndex(nums);
        System.out.println(ans);
    }
}
