import java.util.TreeMap;

public class l456 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums =  {3,1,4,2};
        System.out.println(solution.find132pattern(nums));

    }
    static class Solution {
        public boolean find132pattern(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return false;
            }

            // 左侧最小值
            int leftMin = nums[0];
            // 右侧所有元素
            TreeMap<Integer, Integer> rightAll = new TreeMap<Integer, Integer>();

            for (int k = 2; k < n; ++k) {
                rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
            }

            for (int j = 1; j < n - 1; ++j) {
                if (leftMin < nums[j]) {
                    Integer next = rightAll.ceilingKey(leftMin + 1);
                    if (next != null && next < nums[j]) {
                        return true;
                    }
                }
                leftMin = Math.min(leftMin, nums[j]);
                rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
                if (rightAll.get(nums[j + 1]) == 0) {
                    rightAll.remove(nums[j + 1]);
                }
            }

            return false;
        }
    }}


//    static class Solution {
//        public boolean find132pattern(int[] nums) {
//            int len = nums.length;
//            boolean l=false;
//            boolean r=false;
//            int ll=0;
//            int rr=0;
//            for(int i=1 ;i<len-1;i++){
//                for(ll=i-1 ;ll>=0;ll--){
//                    if(nums[i]>nums[ll])
//                    {
//                        l=true;
//                        for(rr=i+1 ;rr<len-1;rr++){
//                            if((nums[ll]>nums[rr])&&(nums[i]>nums[rr]))
//                            {
//                                r=true;
//
//                            }
//                        }
//
//                    }
//                }
//
//
//
//                if(l && r){
//                    return true;
//                }
//                l=false;
//                r=false;
//            }
//            return false;
//        }
//    }
//}
