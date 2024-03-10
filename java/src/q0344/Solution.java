package q0344;

public class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = new char[]{'a', 'b', 'c'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
