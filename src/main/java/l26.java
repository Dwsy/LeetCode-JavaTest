
public class l26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1, 1, 2, 3}));
    }



    static class  Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != nums[j]) {
                    nums[++j] = nums[i];
                }
            }

            return j + 1;
        }
    }
}
