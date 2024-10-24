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
    private int treeRecursive(TreeNode root, boolean left){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null && left){
            return root.val;
        }
        
        int leftSum = treeRecursive(root.left, true);
        int rightSum = treeRecursive(root.right, false);
        
        return leftSum + rightSum; 
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        return treeRecursive(root, false);
        
    }
}