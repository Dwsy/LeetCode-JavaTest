import java.util.Arrays;

public class l645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println("123");
    }
    static class Solution {
        public int[] findErrorNums(int[] nums) {
            int len = nums.length+1;
            boolean[] arr = new boolean[len];
            int ret[] = new int[2];
            for (int i = 1; i < len; i++) {
                int a = nums[i-1];
                if (arr[a]) {
                    ret[0] = a;

                } else {
                    arr[a]=!arr[a];
                }
            }
            for (int i = 1; i < arr.length; i++) {
                if (!arr[i]) {
                    ret[1] = i;
                }
            };
            return ret;
        }
    }
}
