package q0242;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int n = s.length();
        int[] cnts = new int[26];
        for (int i = 0; i < n; i++) {
            cnts[s.charAt(i) - 'a']++;
            cnts[t.charAt(i) - 'a']--;
        }
        for (int cnt : cnts) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }

}

