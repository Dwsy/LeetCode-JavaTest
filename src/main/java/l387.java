import java.util.HashMap;
import java.util.Map;

public class l387 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "zyxaxyz";
        System.out.println(solution.firstUniqChar(s));
    }
    static class Solution {
        public int firstUniqChar(String s) {
            int[] arr = new int[26];
            int n = s.length();
            for (int i = 0; i < n; i++) {
                arr[s.charAt(i)-'a']++ ;
            }
            for (int i = 0; i < n; i++) {
                if (arr[s.charAt(i)-'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}

