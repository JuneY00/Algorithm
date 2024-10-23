class Solution {
    public int makeConnected(int n, int[][] connections) {

        List<Integer>[] graph = new List[n];
        
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[]conn : connections){
            graph[conn[0]].add(conn[1]);
            graph[conn[1]].add(conn[0]);
        }
        
        boolean[] visited = new boolean[n];
        int components = 0;
        
        // BFS
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                components++;
                bfs(graph, visited, i);
            }
        }
        
        
        if (connections.length < n - 1) {
            return -1;
        }


        return components - 1;
    }
    
    private void bfs(List<Integer>[] graph, boolean[] visited, int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        
        while(!queue.isEmpty()){
            int currNode = queue.poll();
            
            for(int neighbor : graph[currNode]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}