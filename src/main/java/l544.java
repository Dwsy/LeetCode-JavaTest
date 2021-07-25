import java.util.*;

//wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
public class l544 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(0, Arrays.asList(1,2,2,1));
        lists.add(1, Arrays.asList(3,1,2));
        lists.add(2, Arrays.asList(1,3,2));
        lists.add(3, Arrays.asList(2,4));
        lists.add(4, Arrays.asList(3,1,2));
        lists.add(5, Arrays.asList(1,3,1,1));
        System.out.print(String.valueOf(new Solution().leastBricks(lists)));
    }
    static class Solution {
        public int leastBricks(List<List<Integer>> wall) {
            List<Set<Integer>> allGaps = new ArrayList<>();
            // set存下所有可能的画线
            Set<Integer> lineSet = new HashSet<>();
            for (List<Integer> brick : wall) {
                // 存下这一行砖的空隙位置
                Set<Integer> gaps = new HashSet<>();
                int pos = 0;
                // 最右边不算，所以不计入
                for (int i = 0; i < brick.size() - 1; i++) {
                    pos += brick.get(i);
                    gaps.add(pos);
                    lineSet.add(pos);
                }
                allGaps.add(gaps);
            }

            int res = wall.size();
            for (int line : lineSet) {
                int curRes = wall.size();
                for (Set<Integer> gaps : allGaps) {
                    if (gaps.contains(line)) {
                        // 这个位置是空的，所以可以减一
                        curRes--;
                    }
                }
                res = Math.min(res, curRes);
            }
            return res;
        }
    }
}
