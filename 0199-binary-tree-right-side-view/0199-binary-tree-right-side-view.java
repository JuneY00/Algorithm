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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null){
            return l;
        }
        
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int size = q.size();
            int value = node.val; 
            
            if(node.left != null){
                q.add(node.left);    
            }
            if(node.right != null){
                q.add(node.right);  
            }
            
            if(size > 0){
                while(size > 0){
                    TreeNode n = q.poll();
                    value = n.val;

                    if(n.left != null){
                        q.add(n.left);  
                        value = n.val;
                    }
                    
                    if(n.right != null){
                        q.add(n.right);  
                        value = n.val;
                    }                
                    size--;
                }
                l.add(value);
            }
            else{
                l.add(value);

            }
         
        }
        
        return l;
    }
}