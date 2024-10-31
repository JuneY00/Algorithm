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
      
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null || root.right == null || root.left == null){
            return -1;
        }
    
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int first = root.val;
        int second = -1;

        while(!q.isEmpty()){
            TreeNode node = q.poll(); 
            
            // Update 'second' only if the node value is greater than 'first'
            // and either 'second' has not been updated yet(second==-1)
            // or the node value is smaller than the current 'second'
            if(node.val > first){
                if(second == -1 || second > node.val){
                    second = node.val;
                }
            }
            
            if(node.right != null && node.left != null){
                q.add(node.left);
                q.add(node.right);
            }
            
        }
        
        return second;

     }
}