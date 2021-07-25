import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//
//        示例:
//
//        输入: [1,2,3]
//        输出:
//        [
//        [1,2,3],
//        [1,3,2],
//        [2,1,3],
//        [2,3,1],
//        [3,1,2],
//        [3,2,1]
//        ]
public class l46 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 1, 3};
        System.out.println(solution.permute(a));
    }

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            int n = nums.length;
            List<List<Integer>> res = new ArrayList<List<Integer>>();

            List<Integer> output = new ArrayList<Integer>();
            for (int num : nums) {
                output.add(num);
            }

            backtrack(n, output, res, 0);
            return res;
        }

        public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
            // 所有数都填完了
            if (first == n) {
                res.add(new ArrayList<Integer>(output));
            }
            for (int i = first; i < n; i++) {
                // 动态维护数组
                System.out.println(output);
                Collections.swap(output, first, i);
                System.out.println(output);
                System.out.println("----");
                // 继续递归填下一个数
                backtrack(n, output, res, first + 1);
                // 撤销操作
                Collections.swap(output, first, i);
            }
        }
    }
}

