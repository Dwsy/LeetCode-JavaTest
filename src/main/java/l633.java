public class l633 {
    public static void main(String[] args) {

        if (new Solution().judgeSquareSum(8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    static class Solution {
        public boolean judgeSquareSum(int c) {
            int max = (int)Math.sqrt(c);
            for (int a = 0; a <= max; a++) {
                int b = (int)Math.sqrt(c - a * a);
                if (a * a + b * b == c) return true;
            }
            return false;
        }
    }
}
