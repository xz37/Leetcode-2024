package qLCR182;

public class Solution {

//    public String dynamicPassword(String password, int target) {
//        StringBuilder ans = new StringBuilder();
//        int len = password.length();
//        for (int i = 0; i < len; i++) {
//            ans.append(password.charAt((i + target) % len));
//        }
//        return ans.toString();
//    }

    public String dynamicPassword(String password, int target) {
        return password.substring(target, password.length()) +
                password.substring(0, target);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "123";
        String ans = solution.dynamicPassword(s, 2);
        System.out.println(ans);
    }
}
