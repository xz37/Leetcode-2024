package q0925;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0, typedIndex = 0;
        while (typedIndex < typed.length()) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                nameIndex++;
                typedIndex++;
            } else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) {
                typedIndex++;
            } else {
                return false;
            }
        }
        return nameIndex == name.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String name = "pyplrz", typed = "ppyypllr";
        boolean ans = solution.isLongPressedName(name, typed);
        System.out.println(ans);
    }
}
