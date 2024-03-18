package q1002;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] cnts = new int[26];
        for (char ch : words[0].toCharArray()) {
            cnts[ch - 'a']++;
        }

        for (String word : words) {
            int[] tmp = new int[26];
            for (char ch : word.toCharArray()) {
                tmp[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                cnts[i] = Math.min(cnts[i], tmp[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (cnts[i] > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
                cnts[i]--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = new String[]{"bella","label","roller"};
        List<String> ans = solution.commonChars(words);
        System.out.println(ans);
    }
}
