/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Step-1: base conditions
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor (root.left, p, q);
        TreeNode right = lowestCommonAncestor (root.right, p, q);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }
}
