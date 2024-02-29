package q0059;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;
        while (num <= Math.pow(n, 2)) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                ans[i][left] = num++;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[][] ans = solution.generateMatrix(n);
        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
//        System.out.println(Arrays.deepToString(ans));
    }
}
