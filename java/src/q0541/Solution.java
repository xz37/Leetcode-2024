package q0541;

import java.util.Arrays;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] charS = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            reverseCharArray(charS, i, Math.min(i + k - 1, charS.length - 1));
        }

        return new String(charS);
    }

    private void reverseCharArray(char[] chars, int start, int end) {
        if (start > end || start < 0 || end >= chars.length) return;

        int left = start, right = end;
        while (left < right) {
            char tmp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcdefg";
        String ans = solution.reverseStr(s, 2);
        System.out.println(ans);
    }
}
