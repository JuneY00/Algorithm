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
    public TreeNode invertTree(TreeNode root) {
        // base case : if the node is null, return null
        if (root == null){
            return root;
        }
        
        // Swap the left and right children
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        // Recursively invert the left and right subtrees 
        invertTree(root.left);
        invertTree(root.right);
        
        // Return the root after inversion
        return root;
        
    }
}