//public class l938 {
//    public static void main(String[] args) {
//
//    }
//
////      Definition for a binary tree node.
//      public class TreeNode {
//          int val;
//          TreeNode left;
//          TreeNode right;
//          TreeNode() {}
//          TreeNode(int val) { this.val = val; }
//          TreeNode(int val, TreeNode left, TreeNode right) {
//              this.val = val;
//              this.left = left;
//              this.right = right;
//          }
//      }
//
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) { val = x; }
//     * }
//     */
//    class Solution {
//        public int rangeSumBST(TreeNode root, int L, int R) {
//            if (root == null) {
//                return 0;
//            }
//            if (root.val < L) {
//                return rangeSumBST(root.right, L, R);
//            }
//            if (root.val > R) {
//                return rangeSumBST(root.left, L, R);
//            }
//            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
//        }
//    }
//    static class Solution {
//        public int rangeSumBST(TreeNode root, int low, int high) {
//
//        }
//    }
//}
