//public class l135 {
//    public static void main(String[] args) {
//        int[] a = {1, 0, 2};
//        System.out.println(new Solution().candy(a));
//    }
//    static class Solution {
//        public int candy(int[] ratings) {
//            int n = ratings.length;
//            int[] left = new int[n];
//            for (int i = 0; i < n; i++) {
//                if (i > 0 && ratings[i] > ratings[i - 1]) {
//                    left[i] = left[i - 1] + 1;
//                } else {
//                    left[i] = 1;
//                }
//            }
//            int right = 0, ret = 0;
//            for (int i = n - 1; i >= 0; i--) {
//                if (i < n - 1 && ratings[i] > ratings[i + 1]) {
//                    right++;
//                } else {
//                    right = 1;
//                }
//                ret += Math.max(left[i], right);
//            }
//            return ret;
//        }
//    }
////    static class Solution {
////        public int candy(int[] ratings) {
////            int s = ratings.length;
////            int[] dp = new int[s];
////            dp[0] = 1;
////            if (ratings[0] < ratings[1]) {
////                dp[1] = 2;
////            }
////            for (int i = 2; i < s; i++) {
////                if (ratings[i] > ratings[i - 1]&&ratings[i]>ratings[i+1]) {
////                    dp[i] = Math.max(dp[i - 1], dp[i + 1]);
////                }
////            }
////        }
////    }
////}
//
//    static class Solution1 {
//        public int candy(int[] ratings) {
//            int[] dp = new int[ratings.length];
//            dp[0] = 1;
//            for(int i=1; i < ratings.length; i++) {
//                if(ratings[i] > ratings[i-1]){
//                    dp[i] = dp[i-1] + 1;
//                }else if(ratings[i] == ratings[i-1]) {
//                    dp[i] = 1;
//                }else {//若前一个孩子的表现大于当前孩子
//                    if(dp[i-1] == 1){//若前一个孩子糖果为1，则应多给一个糖果
//                        dp[i-1]++;
//                        int j = i-1;
//                        //前一个孩子多给糖果后，有可能会跟他之前的孩子糖果数量一样，则之前孩子的糖果也加一
//                        //且若之前孩子表现与其相同，糖果数量允许相同
//                        while(j > 0 && dp[j] == dp[j-1] && ratings[j] != ratings[j-1]){
//                            dp[j-1]++;
//                            j--;
//                        }
//                    }
//                    dp[i] = 1;
//                }
//            }
//            int res = 0;
//            for(int i=0; i < dp.length; i++){
//                res += dp[i];
//            }
//            return res;
//        }
//
