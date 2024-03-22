package q0459;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder ss = new StringBuilder(s);
        ss.append(s);
        ss.deleteCharAt(0);
        ss.deleteCharAt(ss.length() - 1);
        return ss.indexOf(s) != -1;
    }
}
