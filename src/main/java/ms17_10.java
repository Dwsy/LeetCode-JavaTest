import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ms17_10 {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3,2,3}));
    }
    static class Solution {
        public int majorityElement(int[] nums) {
            int len = nums.length;
            int[] arr = new int[len - 1];
            for (int i = 1; i < len; i++) {
                int a = nums[i - 1];
                int b = nums[i];
                if (a == b) {
                    arr[nums[i]]++;
                }
            }
            Arrays.sort(arr);
            return arr[len-2];
        }
    }
}
