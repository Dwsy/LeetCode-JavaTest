import java.util.*;

public class l1743 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}})));

    }
    static class Solution {
        public int[] restoreArray(int[][] adjacentPairs) {
            int m = adjacentPairs.length, n = m + 1;
            Map<Integer, Integer> cnts = new HashMap<>();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int[] ap : adjacentPairs) {
                int a = ap[0], b = ap[1];
                cnts.put(a, cnts.getOrDefault(a, 0) + 1);
                cnts.put(b, cnts.getOrDefault(b, 0) + 1);
                List<Integer> alist = map.getOrDefault(a, new ArrayList<>());
                alist.add(b);
                map.put(a, alist);
                List<Integer> blist = map.getOrDefault(b, new ArrayList<>());
                blist.add(a);
                map.put(b, blist);
                //swap
                if (ap[0] > ap[1]) {
                    int t = ap[0];
                    ap[0] =  ap[1];
                    ap[1] = t;
                }
            }
            int start = -1;
            for (int i : cnts.keySet()) {
                if (cnts.get(i) == 1) {
                    start = i;
                    break;
                }
            }
            System.out.println(map.get(start));
            int[] ans = new int[n];
            ans[0] = start;
            ans[1] = map.get(start).get(0);
            for (int i = 2; i < n; i++) {
                int x = ans[i - 1];
                List<Integer> list = map.get(x);
                for (int j : list) {
                    if (j != ans[i - 2]) ans[i] = j;
                }
            }
            return ans;
        }
    }
}
