import java.util.Arrays;
import java.util.LinkedList;

public class l239 {
    public static void main(String[] args) {
        int[] nums = {1,-1};
        int k = 1;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, k)));

    }
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums == null || nums.length < 2) return nums;
            // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
            LinkedList<Integer> queue = new LinkedList();
            // 结果数组
            int[] result = new int[nums.length-k+1];
            // 遍历nums数组
            for(int i = 0;i < nums.length;i++){
                // 保证从大到小 如果前面数小则需要依次弹出，直至满足要求
                while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                    queue.pollLast();
                }
                // 添加当前值对应的数组下标
                queue.addLast(i);
                // 判断当前队列中队首的值是否有效
                if(queue.peek() <= i-k){
                    queue.poll();
                }
                // 当窗口长度为k时 保存当前窗口中最大值
                if(i+1 >= k){
                    result[i+1-k] = nums[queue.peek()];
                }
            }
            return result;
        }
    }
//    static class Solution {
//        public int[] maxSlidingWindow(int[] nums, int k) {
////            if (k == 1) {
////                return nums;
////            }
//            int len = nums.length;
//            int l = 0;
//            int r = k-1;
//            int num = len - k  + 1;
//            int t = 0;
//            int temp;
//            int[] a = new int[num];
//            int max = Integer.MIN_VALUE;
//            for (int i = l; i < r; i++) {
//                if (nums[i] > max) {
//                    max = nums[i];
//                }
//            }
//            a[t] = Math.max(nums[r], max);
//            while (t < num) {
//                max = a[t];
//                l++;
//                r++;
//                if (max == nums[l-1]) {
//                    for (int i = l; i < r; i++) {
//                        if (nums[i] > max) {
//                            max = nums[i];
//                        }
//                    }
//                }
//                t++;
//                a[t] = Math.max(nums[r], max);
//
//            }
//            return a;
//        }
//    }
}
