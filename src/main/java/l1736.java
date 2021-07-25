import java.util.Arrays;

public class l1736 {
    public static void main(String[] args) {
        System.out.println(new Solution().maximumTime("?0:15"));

    }
    static class Solution {
        public String maximumTime(String time) {
            char[] arr = time.toCharArray();
            if (arr[0] == '?') {
                arr[0] = ('4' <= arr[1] && arr[1] <= '9') ? '1' : '2';
            }
            if (arr[1] == '?') {
                arr[1] = (arr[0] == '2') ? '3' : '9';
            }
            if (arr[3] == '?') {
                arr[3] = '5';
            }
            if (arr[4] == '?') {
                arr[4] = '9';
            }
            return new String(arr);
        }
    }
}
/*
* class Solution {
        public String maximumTime(String time) {
            if (!time.contains("?")){
                return time;
            }

            char[] chars = time.toCharArray();
            if (!(chars[0] == '0' && chars[1] == '0')) {

                if (chars[1] == '0') {
                    chars[0] = '2';
                }
                if (chars[0] == '2') {
                    chars[1] = '3';
                }

                if (chars[0] == '0') {
                    chars[1] = '9';
                }


                if (chars[0] == '1') {
                    chars[1] = '9';
                }
                if (chars[1] == '?') {

                    chars[1] = '3';
                }
                if (chars[0] == '?') {

                    chars[0] = '2';
                }
            }

            if (chars[3] == '?') {
                chars[3] = '5';
            }
            if (chars[3] == '0') {
                chars[4] = '9';
            }
            if (chars[4] == '?') {
                chars[4] = '9';
            }
            if (chars[4] == '0') {
                chars[3] = '5';
            }
            if (chars[3] == '?'&&chars[4] == '?') {
                chars[3] = '5';
                chars[4] = '9';
            }
            return String.valueOf(chars);
        }
    }
* */