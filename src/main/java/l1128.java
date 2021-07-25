import java.util.Arrays;

public class l1128 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        System.out.println(solution.numEquivDominoPairs(dominoes));
    }
static class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
}
//    static class Solution {
//        public int numEquivDominoPairs(int[][] dominoes) {
//            int ans = 0;
//            int[] cp = new int[100];
//            for (int[] arr : dominoes) {
//                Arrays.sort(arr);
//                ans += cp[arr[0] * 10 + arr[1]]++;
//            }
//            return ans;
//        }
//    }

//    static class Solution {
//        public int numEquivDominoPairs(int[][] dominoes) {
//            int len = dominoes.length;
//            int[] now;
//            int one = 0;
//            int one1 = 0;
//            int two = 0;
//            int two1 = 0;
//            int ret = 0;
//            for (int i = 0; i < len; i++) {
//                now = dominoes[i];
//                one = now[0];
//                two = now[1];
//                for (int j = i+1; j < len; j++) {
//                    now = dominoes[j];
//                    one1 = now[0];
//                    two1 = now[1];
//                    if (one == one1) {
//                        if (two == two1) {
//                            ret++;
//                        }
//                    } else {
//                        if (one !=  two) {
//                            if (one == two1) {
//                                if (two == one1) {
//                                    ret++;
//                                }
//                            }
//                        }
//
//                    }
////                    if ((one == one1 && two == two1)||(one == two1 && two == one1)) {
////                        ret++;
////                    }
//                }
//            }
//            return ret;
//        }
//    }
}
