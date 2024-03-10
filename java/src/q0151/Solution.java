package q0151;

public class Solution {
//    public String reverseWords(String s) {
//        String[] ss = s.trim().split("\\s+");
//        int left = 0, right = ss.length - 1;
//        while (left < right) {
//            String tmp = ss[left];
//            ss[left++] = ss[right];
//            ss[right--] = tmp;
//        }
//        return String.join(" ", ss);
//    }

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (word.length() != 0) {
                    ans.append(word);
                    ans.append(" ");
                    word = new StringBuilder();
                }
            } else {
                word.insert(0, s.charAt(i));
            }
        }

        if (word.length() == 0) {
            return ans.substring(0, ans.length() - 1);
        } else {
            ans.append(word);
            return ans.toString();
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseWords("  hello world  ");
        System.out.println(ans);
    }
}
