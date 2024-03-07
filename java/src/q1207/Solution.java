package q1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> times = new HashMap<>();
        for (int num : arr) {
            times.put(num, times.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurred = new HashSet<>();
        for (int time : times.values()) {
            if (time == 0) continue;
            if (occurred.contains(time)) return false;
            occurred.add(time);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,2,1,1,3};
        boolean ans = solution.uniqueOccurrences(arr);
        System.out.println(ans);
    }
}
