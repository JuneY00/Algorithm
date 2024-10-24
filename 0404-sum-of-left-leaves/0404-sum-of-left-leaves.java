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
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }
    
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            
            System.out.println(node.val);
            
            // Check if left child exists
            if(node.left != null){
                
                // if the left child is a leaf node, and its value to the sum
                if(node.left.left == null && node.left.right == null){
                    sum += node.left.val;
                }else{
                    stack.push(node.left);
                }
            }
            
            //  if right child exists, push the right child to the stack 
            if(node.right != null){
                stack.push(node.right);
            }
            
        }
        
        return sum;
    }
}



// class Solution {
//     private int treeRecursive(TreeNode root, boolean left){
//         if(root == null){
//             return 0;
//         }
        
//         if(root.left == null && root.right == null && left){
//             return root.val;
//         }
        
//         int leftSum = treeRecursive(root.left, true);
//         int rightSum = treeRecursive(root.right, false);
        
//         return leftSum + rightSum; 
        
//     }
//     public int sumOfLeftLeaves(TreeNode root) {
        
//         if(root == null){
//             return 0;
//         }
        
//         return treeRecursive(root, false);
        
//     }
// }