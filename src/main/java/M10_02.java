import java.util.*;

public class M10_02 {
    public static void main(String[] args) {
        System.out.println((new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})).toString());
    }

    static class Solution {
        public List<List<String>> groupAnagrams(String[] ss) {
            List<List<String>> ans = new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();
            for (String s : ss) {
                char[] cs = s.toCharArray();
                Arrays.sort(cs);
                String key = String.valueOf(cs);
                List<String> list = map.getOrDefault(key, new ArrayList<>());
                list.add(s);
                map.put(key, list);
            }
            for (String key : map.keySet()) ans.add(map.get(key));
            return ans;
        }
    }
}
