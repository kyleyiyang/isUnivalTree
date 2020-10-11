/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean a = true;
    public boolean isUnivalTree(TreeNode root) {
        return recursion(root);
    }
    public boolean recursion(TreeNode node) {
        if (node!=null) {
            if (node.left!=null && node.val!=node.left.val) {
                a = false;
            }
            recursion(node.left);
            if (node.right!=null && node.val!=node.right.val) {
                a = false;
            }
            recursion(node.right);
        }
        return a;
    }
}
