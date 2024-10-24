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
 
    private boolean hasSum(TreeNode root, int sum, int targetSum){
        sum += root.val;
        // System.out.println(root.val);

        if(root.left == null && root.right == null){
            if(sum== targetSum){
                return true;
            }
            else{
                return false;
            }
        }
        
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
}