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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Double> averages = new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Double all = 0.0;
            int size = q.size();

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                all += node.val;

                if(node.left != null){
                    q.add(node.left);                
                }

                if(node.right != null){
                    q.add(node.right);    
                }
    
            }
           
            averages.add(all / size);
           
        }
        
        return averages;
    }
}