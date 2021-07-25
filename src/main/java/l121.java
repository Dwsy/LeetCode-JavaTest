import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l121
{
    public static void main(String[] args) {
        int[] a = {2,1,2,0,1};
        System.out.println(new Solution().maxProfit(a));

    }
    static public class Solution {

            public int maxProfit(int prices[]) {
                int minprice = Integer.MAX_VALUE;
                int maxprofit = 0;
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] < minprice) {
                        minprice = prices[i];
                    } else if (prices[i] - minprice > maxprofit) {
                        maxprofit = prices[i] - minprice;
                    }
                }
                return maxprofit;
            }

//        public int maxProfit(int prices[]) {
//            int maxprices = 0;
//            int[] t = new int[prices.length];
//            int[] array = new int[prices.length];
//            System.arraycopy(prices, 0, array, 0, prices.length);
//            Arrays.sort(prices);
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            for (int i = 0; i < prices.length; i++) {
//                t[i] = prices[prices.length - 1 - i];
//            }
//            if (Arrays.equals(t, array)) {
//                return 0;
//            }
//            for (int price : prices) {
//                arrayList.add(price);
//            }
//
//            int l = 0;
//            int r = prices.length-1;
//            while (l<r) {
//                int min = prices[l];
//                int max = prices[r];
//                int indexl = arrayList.indexOf(min);
//                int indexr = arrayList.indexOf(max);
//                if (indexl<indexr) {
//                    int test = array[indexr] - array[indexl];
//
//                    if (test > maxprices) {
//                        maxprices = array[indexr] - array[indexl];
//
//                    }
//
//
//                }
//                if (r > l) {
//                    r--;
//                }
//                if (r==l) {
//                    r=prices.length-1;
//                    l++;
//                }
//
//            }
//            return maxprices;
//        }

    }

}
