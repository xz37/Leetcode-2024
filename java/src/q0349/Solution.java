package q0349;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] occurred1 = new boolean[1001];
        boolean[] occurred2 = new boolean[1001];
        for (int num : nums1) {
            occurred1[num] = true;
        }
        for (int num : nums2) {
            occurred2[num] = true;
        }

        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            if (occurred1[i] && occurred2[i]) {
                ansList.add(i);
            }
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] ans = solution.intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

}
