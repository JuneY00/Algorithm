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
    private boolean hasSum(TreeNode node, int sum, int targetSum){
        sum += node.val;
        
        if(node.left == null && node.right == null){
            return sum == targetSum;
        }
        
        if(node.left == null){
            return hasSum(node.right, sum, targetSum);
        }
        
        if(node.right == null){
            return hasSum(node.left, sum, targetSum);
        }
        
        return hasSum(node.left, sum, targetSum) || hasSum(node.right,sum,targetSum);
    }
        
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }
        
        return hasSum(root, 0, targetSum);
        
    }
}
    
    
/*
class Solution {
 
    private boolean hasSum(TreeNode root, int sum, int targetSum){
        sum += root.val;
        // System.out.println(root.val);

        if(root.left == null && root.right == null){
            return sum == targetSum;
        
        if(root.right == null){
            return hasSum(root.left, sum, targetSum);
        }
        
        if(root.left == null){
            return hasSum(root.right, sum, targetSum);
        }

            
        return  hasSum(root.left, sum, targetSum) || hasSum(root.right, sum, targetSum); 
                
    }
        
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }
        
        return hasSum(root, 0, targetSum);
        
    }
}*/