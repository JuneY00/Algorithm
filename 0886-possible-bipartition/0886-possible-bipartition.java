class Solution {
    // BFS method to check if graph can be bipartite starting from 'node'
    public boolean bfs(Map<Integer, List<Integer>> graph, int[] color, int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node); // add node
        color[node] = 0; // first node color 0 
        
        while(!queue.isEmpty()){
            int curr = queue.poll();
            int currColor = color[curr];
            
            for(int neighbor: graph.get(curr)){
                if(color[neighbor] == -1){
                    // color it with the oppposite color 
                    color[neighbor] = 1-currColor;
                    queue.offer(neighbor);
                }else if(color[neighbor] == currColor){
                    return false;
                }
            }
        }
        return true;   
    }
    
    
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // Create an adjacency list for the graph 
        Map<Integer, List<Integer>> graph = new HashMap<>(); 
        
        for(int i = 1; i <= n; i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] dislike: dislikes){
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }
        /* ex.
            graph = {
                1: [2, 3],
                2: [1, 4],
                3: [1],
                4: [2]
            }
        
        */
        
        // Array to store the color of each person, initialized to -1 (unvisited)
        int[] color = new int[n+1];
        Arrays.fill(color,-1);
        
        // Perform BFS for every unvisited node

        for(int i = 1; i <= n; i++){
            if(color[i] == -1){
                if(!bfs(graph,color,i)){
                    return false;
                }
            }
        }
        return true;
    }
} 
       