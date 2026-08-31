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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootString = preOrderTraversal(root);
        String subRootString = preOrderTraversal(subRoot);

        return rootString.contains(subRootString);
    }

    private String preOrderTraversal(TreeNode root){
        if(root == null){
            return "null";
        }
        String res = root.val + preOrderTraversal(root.left)+preOrderTraversal(root.right);
        return res.toString();
    }
}
