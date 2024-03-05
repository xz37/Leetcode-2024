package q1356;

import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] ans = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(ans, (o1, o2) -> {
            int bit1 = getBitNum(o1), bit2 = getBitNum(o2);
            return bit1 != bit2 ? bit1 - bit2 : o1 - o2;
        });
        Arrays.sort(ans, (o1, o2) -> getBitNum(o1) - getBitNum(o2));

        System.out.println(Arrays.toString(ans));
        return Arrays.stream(ans).mapToInt(i -> i).toArray();
    }

    private int getBitNum (Integer i) {
        int num = 0;
        while (i > 0) {
            num += (i & 1);
            i >>= 1;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1024,512,256,128,64,32,16,8,4,2,1};
        int[] ans = solution.sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }
}
