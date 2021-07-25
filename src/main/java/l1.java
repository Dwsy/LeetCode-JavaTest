import java.util.*;

public class l1 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,6,7,3,2,4};
        int[] nums1 = {100,3,1213,123,2213,2113,12,412,4,45,6,45,7456,23,23,21,312,534,23,546,46,451,4,3,6,7,3,2,4};
        int target = 125;
//        int[] nums = {-10,7,19,15};
//        int target = 9;
        long startTime1=System.nanoTime();   //获取开始时间
        System.out.println(Arrays.toString(new Solution2().twoSum(nums1, target)));
        long endTime1=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime1-startTime1)+"ns");

        long startTime=System.nanoTime();   //获取开始时间
        System.out.println(Arrays.toString(new Solution2().twoSum(nums, target)));
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");

        long startTime3=System.nanoTime();   //获取开始时间
        System.out.println(Arrays.toString(new Solution2().twoSum(nums1, target)));
        long endTime3=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime3-startTime3)+"ns");

        long startTime4=System.nanoTime();   //获取开始时间
        System.out.println(Arrays.toString(new Solution2().twoSum(nums1, target)));
        long endTime4=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime4-startTime4)+"ns");

        long startTime5=System.nanoTime();   //获取开始时间
        System.out.println(Arrays.toString(new Solution2().twoSum(nums1, target)));
        long endTime5=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime5-startTime5)+"ns");

    }
    static class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int t = -1;
            if (target % 2 == 0) {
                t = target / 2;
            }
            int[] n = nums.clone();
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
//            System.out.println(list.indexOf(3));
//            System.out.println(list.indexOf(3));
            Arrays.sort(nums);
            int len = nums.length-1;
            int l=0, r = len;
            for (int i = len; i > 0; i--) {

                if (nums[i] > target) {
                    r -= 1;
                }
            }
            if (nums[r] == target && target != 0) {
                r += 1;
            }
            for (int i = 0; i <= len; i++) {

                if (nums[i]+nums[r]<target) {
                    l += 1;
                }
                if (nums[i] + nums[r] == target) {

                    if (nums[i] == t) {
                        return new int[]{list.indexOf(nums[l]), list.lastIndexOf(nums[r])};
                    }
                    int[] re = {list.indexOf(nums[l]), list.indexOf(nums[r])};
                    Arrays.sort(re);
                    return re;
                }
            }
            return null;
        }
    }
}

