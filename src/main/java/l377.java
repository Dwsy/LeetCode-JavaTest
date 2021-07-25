import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l377 {
    public static void main(String[] args) {
//        输入：nums = [1,2,3], target = 4
//        输出：7
//        解释：
//        所有可能的组合为：
//        (1, 1, 1, 1)
//        (1, 1, 2)
//        (1, 2, 1)
//        (1, 3)
//        (2, 1, 1)
//        (2, 2)
//        (3, 1)
//        请注意，顺序不同的序列被视作不同的组合。
        int[] test = {1, 2, 3};
        System.out.println(new Solution().combinationSum4(test, 4));
    }
    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int len = nums.length;
            List<int[]> list = Arrays.asList(nums);
            Arrays.sort(new List[]{list});
            for (int num : nums) {
                System.out.println(num);
            }
            return 0;
        }
    }
}
