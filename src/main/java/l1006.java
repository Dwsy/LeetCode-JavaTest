//import java.util.LinkedList;
//
//public class l1006 {
//    public static void main(String[] args) {
//        Solution t = new Solution();
//        System.out.println(t.clumsy(4));
//    }
//    static class Solution {
//        public int clumsy(int N) {
//            Deque<Integer> stack = new LinkedList<Integer>();
//            stack.push(N);
//            N--;
//
//            int index = 0; // 用于控制乘、除、加、减
//            while (N > 0) {
//                if (index % 4 == 0) {
//                    stack.push(stack.pop() * N);
//                } else if (index % 4 == 1) {
//                    stack.push(stack.pop() / N);
//                } else if (index % 4 == 2) {
//                    stack.push(N);
//                } else {
//                    stack.push(-N);
//                }
//                index++;
//                N--;
//            }
//
//            // 把栈中所有的数字依次弹出求和
//            int sum = 0;
//            while (!stack.isEmpty()) {
//                sum += stack.pop();
//            }
//            return sum;
//        }
//    }
//}
