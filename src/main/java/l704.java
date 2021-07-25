import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class l704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(new Solution().search(nums,9));

    }
    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int middle;
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] < target) {
                    left = middle + 1;
                }
                else if (nums[middle] > target) {
                    right = middle - 1;
                }
                else return middle;
            }
            return 0;
        }
    }
}
