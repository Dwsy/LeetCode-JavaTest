public class l1232 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Solution solution = new Solution();
        System.out.println(solution.checkStraightLine(a));


    }
    static class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int x1 =coordinates[1][0]-coordinates[0][0];
            int y1 =coordinates[1][1]-coordinates[0][1];
            for (int i = 2; i < coordinates.length; i++) {
                int x2 =coordinates[i][0]-coordinates[0][0];
                int y2 =coordinates[i][1]-coordinates[0][1];
                if (x1 * y2 != x2 * y1) {
                    return false;
                }
            }
            return true;
        }
    }
}
