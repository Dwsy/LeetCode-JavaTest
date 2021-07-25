import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] coins = {1, 2, 5};
        int amount=11;
        System.out.println(solution1.coinChange(coins, amount));
    }

    static class Solution1 {
        int res = Integer.MAX_VALUE;
        public int coinChange(int[] coins, int amount){
            if(amount==0){
                return 0;
            }
            Arrays.sort(coins);
            mincoin(coins,amount,coins.length-1,0);
            return res==Integer.MAX_VALUE? -1:res;
        }
        private void mincoin(int[] coins,int amount, int index, int count){
            if(amount==0){
                res = Math.min(res,count);
                return;
            }
            if(index<0){
                return;
            }
            for(int i = amount/coins[index];i>=0 && i+count<res; i--){
                mincoin(coins,amount - (i*coins[index]), index-1, count+i);
            }
        }
    }
}

