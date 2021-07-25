import java.util.HashMap;
import java.util.Map;

public class l1711 {
    public static void main(String[] args) {
        System.out.println(new Solution().countPairs(new int[]{1, 3, 5, 7, 9}));
    }
    static class Solution {
        int mod = (int)1e9+7;
        public int countPairs(int[] ds) {
            int n = ds.length;
            long ans = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = ds[i];
                for (int other : map.keySet()) {
                    if (check(other + x)) ans += map.get(other);
                }
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            System.out.printf(String.valueOf(map));
            return (int)(ans % mod);
        }
        boolean check(long x) {
            // 方法一
            // long cur = 1;
            // while (cur < x) {
            //     cur = cur * 2;
            // }
            // return cur == x;

            // 方法二
            return getVal(x) == x;
        }
        long getVal(long x) {
            long n = x - 1;
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            return n < 0 ? 1 : n + 1;
        }
    }
}
