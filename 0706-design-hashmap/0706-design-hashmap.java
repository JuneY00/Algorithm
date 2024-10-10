class MyHashMap {

    class Node{
        int key;
        int value;
        
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }        
    }
    
    // Initial size of the hash map array 
    private static final int SIZE = 1000;
    private List<Node>[] map; 
    
    // Constructor 
    public MyHashMap(){
        map = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++){
            map[i] = new LinkedList<>();
        }
    }
    
    // Method to add or update key-value pair
    public void put(int key, int value) {
        int hash = key%SIZE;
        List<Node> bucket = map[hash];
        for(Node node : bucket){
            if(node.key == key){
                node.value = value;
                return;
            }
        }
        
        bucket.add(new Node(key,value));
        
    }
    
    public int get(int key) {
        int hash = key%SIZE;
        List<Node> bucket = map[hash];
        for(Node node : bucket){
            if(node.key == key){
                return node.value;
            }
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int hash = key%SIZE;
        List<Node> bucket = map[hash];
        for(Node node: bucket){
            if(node.key == key){
                bucket.remove(node);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */