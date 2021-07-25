import java.util.ArrayList;
import java.util.List;

public class l228 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    //    static class Solution {
//        public List<String> summaryRanges(int[] nums) {
//            List<String> ret = new ArrayList<String>();
//            int i = 0;
//            int n = nums.length;
//            while (i < n) {
//                int low = i;
//                i++;
//                while (i < n && nums[i] == nums[i - 1] + 1) {
//                    i++;
//                }
//                int high = i - 1;
//                StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
//                if (low < high) {
//                    temp.append("->");
//                    temp.append(Integer.toString(nums[high]));
//                }
//                ret.add(temp.toString());
//            }
//            return ret;
//        }
//    }
    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();
            for (int i = 0, j = 0; j < nums.length; j++) {
                if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                    continue;
                }
                if (i == j) {
                    list.add(nums[i] + "");
                } else {
                    list.add(nums[i] + "->" + nums[j]);
                }
                i = j + 1;
            }
            return list;
        }
    }
}

