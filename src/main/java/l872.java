//import java.util.ArrayList;
//import java.util.List;
//
//public class l872 {
//}
//
////Definition for a binary tree node.
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
// }
//
//class Solution1 {
//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
//        if (l1.size() == l2.size()) {
//            for (int i = 0; i < l1.size(); i++) {
//                if (!l1.get(i).equals(l2.get(i))) return false;
//            }
//            return true;
//        }
//        return false;
//
//    }
//    void dfs(TreeNode root ,List<Integer> list){
//        if (root == null) return;
//        if (root.left == null && root.right == null) {
//            list.add(root.val);
//            return;
//        }
//        dfs(root.left, list);
//        dfs(root.right, list);
//
//    }
//
//    public boolean solveNQueens(int i) {
//    }
//}
////class Solution {
////    public boolean leafSimilar(TreeNode t1, TreeNode t2) {
////        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
////        dfs(t1, l1);
////        dfs(t2, l2);
////        if (l1.size() == l2.size()) {
////            for (int i = 0; i < l1.size(); i++) {
////                if (!l1.get(i).equals(l2.get(i))) return false;
////            }
////            return true;
////        }
////        return false;
////    }
////    void dfs(TreeNode root, List<Integer> list) {
////        if (root == null) return;
////        if (root.left == null && root.right == null) {
////            list.add(root.val);
////            return;
////        }
////        dfs(root.left, list);
////        dfs(root.right, list);
////    }
////}