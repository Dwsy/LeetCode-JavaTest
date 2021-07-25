//import sun.security.util.Length;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class l198 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int[] nums = {1, 2, 1, 1};
//        int[] nums2 = {2, 7, 9, 3, 1};
////        System.out.println(solution.rob(nums));
//        System.out.println(solution.rob(nums2));
//    }
//    static class Solution {
//        int rob(int[] nums) {
//            int n = nums.length;
//            int[] dp = new int[n + 2];
//            for (int i = n - 1; i >= 0; i--) {
//                dp[i] = Math.max(dp[i + 1], nums[i] + dp[i + 2]);
//            }
//            return dp[0];
//        }
//    }
//
//}
