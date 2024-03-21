package q0202;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = calculate(calculate(n));
        while (slow != fast) {
            slow = calculate(slow);
            fast = calculate(calculate(fast));
        }
        return slow == 1;
    }

    private int calculate(int n) {
        int res = 0;
        while (n > 0) {
            res += (int) Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;
        boolean ans = solution.isHappy(n);
        System.out.println(ans);
    }
}
