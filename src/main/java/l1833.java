import java.util.Arrays;

public class l1833 {
    public static void main(String[] args) {
        int[] costs = new int[]{1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(new Solution().maxIceCream(costs,coins));
    }
static class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for (int cost : costs) {
            freq[cost]++;
        }
        int count = 0;
        for (int i = 1; i <= 100000; i++) {
            if (coins >= i) {
                int curCount = Math.min(freq[i], coins / i);
                count += curCount;
                coins -= i * curCount;
            } else {
                break;
            }
        }
        return count;
    }
}
//    class Solution {
//        public int maxIceCream(int[] costs, int coins) {
//            Arrays.sort(costs);
//            int count = 0;
//            int n = costs.length;
//            for (int i = 0; i < n; i++) {
//                int cost = costs[i];
//                if (coins >= cost) {
//                    coins -= cost;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            return count;
//        }
//    }
//    static class Solution {
//        public int maxIceCream(int[] costs, int coins) {
//            Arrays.sort(costs);
//            int sum = 0;
//            int x = 0;
//            for (int i = 0; i < costs.length; i++) {
//                sum += costs[i];
//                x++;
//                if (sum > coins) {
//                    if (sum == coins) {
//                        continue;
//                    }
//                    x--;
//                    continue;
//                }
//            }
//            return x;
//        }
//    }
}
