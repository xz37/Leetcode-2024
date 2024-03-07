package q0941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;

        int top = 0;
        while (top + 1 < len && arr[top + 1] > arr[top]) {
            top += 1;
        }
        if (top + 1 == len || top == 0) return false;

        int bottom = top;
        while (bottom + 1 < len && arr[bottom + 1] < arr[bottom]) {
            bottom += 1;
        }
        return bottom + 1 == len && bottom != top;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,1};
        boolean ans = solution.validMountainArray(arr);
        System.out.println(ans);

    }
}
