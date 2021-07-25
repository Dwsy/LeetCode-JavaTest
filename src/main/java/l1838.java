import java.util.Arrays;

public class l1838 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxFrequency(new int[]{1, 4, 8, 13},5));

    }
    static class Solution {
        int[] nums, sum;
        int n, k;
        public int maxFrequency(int[] _nums, int _k) {
            nums = _nums;
            k = _k;
            n = nums.length;
            Arrays.sort(nums);
            sum = new int[n + 1];
            for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + nums[i - 1];
            int l = 0, r = n;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (check(mid)) l = mid;
                else r = mid - 1;
            }
            return r;
        }
        boolean check(int len) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;
                int cur = sum[r + 1] - sum[l];
                int t = nums[r] * len;
                if (t - cur <= k) return true;
            }
            return false;
        }
    }
// class Solution {
//     public int maxFrequency(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int left=0,right=1;
//         int ans=1;
//         while(right<n)
//         {
//             k-=((nums[right]-nums[right-1])*(right-left));
//             if(k>=0)
//             {
//                 ans=right-left+1;//符合题意的答案
//             }
//             else{
//                 //不符合题意的答案，left要相应右移一位
//                 left++;
//                 k+=(nums[right]-nums[left-1]);
//             }
//             right++;//right是一直右移的
//         }
//         return ans;
//     }
// }
}
