import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lcp07 {
    public static void main(String[] args) {
        int n = 5, k = 3;

        int[][] relation = new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int i = new Solution().numWays(n,relation,k);
        System.out.println(i);
    }
//    方法一：深度优先搜索
//    可以把传信息的关系看成有向图，每个玩家对应一个节点，每个传信息的关系对应一条有向边。如果 xx 可以向 yy 传信息，则对应从节点 xx 到节点 yy 的一条有向边。寻找从编号 00 的玩家经过 kk 轮传递到编号 n-1n−1 的玩家处的方案数，等价于在有向图中寻找从节点 00 到节点 n-1n−1 的长度为 kk 的路径数，同一条路径可以重复经过同一个节点。
//
//    可以使用深度优先搜索计算方案数。从节点 00 出发做深度优先搜索，每一步记录当前所在的节点以及经过的轮数，当经过 kk 轮时，如果位于节点 n-1n−1，则将方案数加 11。搜索结束之后，即可得到总的方案数。
//
//    具体实现方面，可以对传信息的关系进行预处理，使用列表存储有向边的关系，即可在 O(1)O(1) 的时间内得到特定节点的相邻节点（即可以沿着有向边一步到达的节点）。
//    static class Solution {
//        int ways, n, k;
//        List<List<Integer>> edges;
//
//        public int numWays(int n, int[][] relation, int k) {
//            ways = 0;
//            this.n = n;
//            this.k = k;
//            edges = new ArrayList<List<Integer>>();
//            for (int i = 0; i < n; i++) {
//                edges.add(new ArrayList<Integer>());
//            }
//            for (int[] edge : relation) {
//                int src = edge[0], dst = edge[1];
//                edges.get(src).add(dst);
//            }
//            dfs(0, 0);
//            return ways;
//        }
//
//        public void dfs(int index, int steps) {
//            if (steps == k) {
//                if (index == n - 1) {
//                    ways++;
//                }
//                return;
//            }
//            List<Integer> list = edges.get(index);
//            for (int nextIndex : list) {
//                dfs(nextIndex, steps + 1);
//            }
//        }
//    }
    static class Solution {
    public int numWays(int n, int[][] relation, int k) {
        List<List<Integer>> edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] edge : relation) {
            int src = edge[0], dst = edge[1];
            edges.get(src).add(dst);
        }

        int steps = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(0);
        while (!queue.isEmpty() && steps < k) {
            steps++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int index = queue.poll();
                List<Integer> list = edges.get(index);
                for (int nextIndex : list) {
                    queue.offer(nextIndex);
                }
            }
        }

        int ways = 0;
        if (steps == k) {
            while (!queue.isEmpty()) {
                if (queue.poll() == n - 1) {
                    ways++;
                }
            }
        }
        return ways;
    }
}
}
