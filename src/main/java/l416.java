public class l416 {
    public static void main(String[] args) {
        System.out.println(new Solution().canPartition(new int[]{1, 5, 11, 5}));
    }
    static class Solution {
        public boolean canPartition(int[] nums) {
            if (nums == null || nums.length <= 0) {
                return false;
            }

        /*
            若 数组之和为奇数，则不可能满足条件，直接返回false
         */
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (sum % 2 != 0) {
                return false;
            }

            int target = sum / 2;

        /*
            dp[i] 表示 i 能否用nums数组中的其它元素 相加而成
         */
            boolean[] dp = new boolean[target + 1]; // 用于存储 “背包”问题 每一个状态的可能性
            dp[0] = true;
            for (int num : nums) {  // 遍历 可放入“背包”的“物品”
                for (int i = target; i >= num; i--) {   // 从后向前，计算dp数组
                    dp[i] = dp[i] || dp[i - num];
                }
            }

            return dp[target];
        }
    }
}

