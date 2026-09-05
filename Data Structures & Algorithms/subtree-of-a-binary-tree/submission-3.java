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
    StringBuilder s;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(subRoot == null) return true;

        String sub = preOrder(subRoot);
        String subo = preOrder(root);

        return subo.contains(sub);
    }

    private String preOrder(TreeNode root){
        if(root == null){
            return "null";
        }
        String res = root.val + preOrder(root.left) + preOrder(root.right);
        return res.toString();
    }
}
