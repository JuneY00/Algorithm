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
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        return find(root, set, k);
    }
    
    public boolean find(TreeNode node, HashSet set, int k){
        if(node == null){ return false;}
        
        if(set.contains(k-node.val)){return true;}        
        
        set.add(node.val);
        
        return find(node.left, set, k ) || find(node.right, set, k);
    }
}