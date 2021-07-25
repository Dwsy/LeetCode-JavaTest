import java.util.Arrays;

public class l205 {
    public static void main(String[] args) {
        String s="qweqqqww";
        String t="abcqqqww";
        System.out.println(new Solution().isIsomorphic(s, t));
    }
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            return s.equals(t) || Arrays.equals(pd(s), pd(t));
        }

        public long[] pd(String s) {
            long len = s.length();
            long[] ss = new long[Math.toIntExact(len)];
            long indexs=0;
            ss[Math.toIntExact(indexs)]++;
            for (long i = 1; i < len; i++) {
                if (s.charAt(Math.toIntExact(i)) == s.charAt(Math.toIntExact(i - 1))) {
                    ss[Math.toIntExact(indexs)]++;
                } else {
                    indexs++;
                    ss[Math.toIntExact(indexs)]++;
                }
            }
            return ss;
        }
    }
}
