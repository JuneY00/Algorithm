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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return -1;
        }
        
        traverse(root, list);
        System.out.println(list);
        System.out.println(list.get(k-1));

        return list.get(k-1);
    }
    
    private void traverse(TreeNode node, ArrayList list){

        if(node == null){
            return;
        }
        
        if(node.left != null){
            traverse(node.left, list);
        }

        list.add(node.val);
        
        if(node.right != null){
            traverse(node.right, list);
        }
        
    }
}