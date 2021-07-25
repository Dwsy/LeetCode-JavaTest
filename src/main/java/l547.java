public class l547 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] isConnected =  {{1, 1, 1},
                                {1, 1, 1},
                                {1, 1, 1}};
        System.out.println(solution.findCircleNum(isConnected));

    }
//    static class Solution {
//        public int findCircleNum(int[][] isConnected) {
//            int max = isConnected.length;
//            int ret = max;
//            for (int i = 0; i < max; i++) {
//                if (i == max - 1) {
//                    return ret;
//                }
//                if (isConnected[i][i + 1] == 0) {
//                    continue;
//                }
//                for (int j = i; j < max; j++) {
//                    if (j == max - 1) {
//                        return ret;
//                    }
//                    if (isConnected[j][j + 1] == 1) {
//                        ret--;
//                    }
//                }
//            }
//            return ret;
//        }
//    }
    static class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, provinces, i);
                circles++;
            }
        }
        return circles;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int provinces, int i) {
        for (int j = 0; j < provinces; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, provinces, j);
            }
        }
    }
}
}
