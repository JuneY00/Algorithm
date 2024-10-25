/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        // Base case : if the root is null, the depth is 0 
        if(root==null){
            return 0;
        }
        
        // Start with a depth 1 (counting the root itself)
        int maxDepth= 1; 
        
        // Recursively check each child and find the maximum depth 
        for(Node n : root.children){
            int depth = maxDepth(n); // Recursively find depth of each child
            maxDepth = Math.max(maxDepth, depth+1); //update max depth considering the current node 
        }
        
        return maxDepth;
    }
    
}
