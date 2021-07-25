
import java.util.HashSet;
import java.util.Set;

public class l567 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s1 = "ab";
//        String s2 = "eidbaooo";

        String s1 = "ac";
        String s2 = "qweca";
        System.out.println(solution.checkInclusion(s1, s2));

//        System.out.println(s3.toString());
    }


static public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        // 'z' = 122 ,不过一般都是2的倍数。 这样就省去了 +(-)'a'的功夫，简洁很多，也不容易出错
        int[] needs = new int[128];
        int[] inWindow = new int[128];

        // 记录 s1 有多少种字母
        Set<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            needs[ch]++;
            set.add(ch);
        }
        int needCharNums = set.size();

        //关键，维护一个大小为 s1.length() 的滑动窗口，窗口内的字母数量对应即合法
        int windowLen = s1.length();
        // 通过变量valid，指示窗口内已满足条件的字母数量，省去每次扫描 26个字母数量是否相等
        int valid = 0;

        int left = 0;
        // 把初始化窗口整合到了while中，因此right = 0;
        int right = 0;
        while (right < s2.length()) {

            char cur = s2.charAt(right);
            right++;
            inWindow[cur]++;
            // 细节1: 两个if条件必须对应，用 == 较好理解。
            // 细节2.1: 此处是先归入窗口inWin[]++ ,再判断if。
            if (inWindow[cur] == needs[cur]) {
                valid++;
            }
            if (valid == needCharNums) return true;

            // 窗口还未初始化完成 , [0,windowLen) ----  [left,right) ( 因为right++了)
            if(right < windowLen) continue;

            char leftChar = s2.charAt(left);
            left++;
            //细节2.2 :缩小窗口时，是先判断if,再缩小inWin[]--
            if (inWindow[leftChar] == needs[leftChar]) {
                valid--;
            }
            inWindow[leftChar]--;
        }
        return false;
    }
}



//    static class Solution {
//        public boolean checkInclusion(String s1, String s2) {
//
//            //维护两个数组，记录已有字符串指定字符的出现次数，和目标字符串指定字符的出现次数
//            //ASCII表总长128
//            int[] need = new int[128];
//            int[] have = new int[128];
//
//            //将目标字符串指定字符的出现次数记录
//            for (int i = 0; i <  s1.length(); i++) {
//                need[s2.charAt(i)]++;
//            }
//
//            int set=1;
//
//            int left = 0, right = 0, max = s1.length()-1;
//            while (right-left <= max||left<=max) {
//                char r = s2.charAt(right);
//
//                if (need[r] == 0) {
//                    left = right;
//                    right++;
//                    System.out.println("l"+left);
//                    System.out.println("r"+right);
//                    System.out.println(s2.substring(left,right));
////                    left++;
////                    right++;
//                    continue;
//                }
//
//                have[r]++;
//
//                right++;
//
//                for (int i = 97; i < 128; i++) {
//                    if (need[i] != have[i]) {
//                        set = 1;
//                        break;
//                    }
//                    set = 0;
//                }
//
//                if (set == 0 && right-left == max) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//
//    }
}
