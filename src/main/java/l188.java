public class l188 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }
    static class Solution {
        public int maxProfit(int k, int[] prices) {
            if(prices==null || prices.length==0) {
                return 0;
            }
            return dfs(0,0,0,k,prices);
        }
        //计算k次交易，index表示当前是哪天，status是买卖状态，coutnt为交易次数
        private int dfs(int index, int status, int count, int k, int[] prices) {
            if(index==prices.length || count==k) {
                return 0;
            }
            int a=0,b=0,c=0;
            //保持不动
            a = dfs(index+1,status,count,k,prices);
            System.out.println(a);
            if(status==1) {
                //卖一股，并将交易次数+1
                b = dfs(index+1,0,count+1,k,prices)+prices[index];}
            else {
                //买一股
                c = dfs(index+1,1,count,k,prices)-prices[index];}
            System.out.println(b);
            System.out.println(c);
            return Math.max(Math.max(a,b),c);
        }
    }
}
