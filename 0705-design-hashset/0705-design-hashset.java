class MyHashSet {
    private static final int SIZE = 1000;
    private LinkedList<Integer>[] buckets;
    
    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        
        for(int i = 0; i < SIZE; i++){
            buckets[i] = new LinkedList<>();
            System.out.println(buckets[i]);
        }   
    }
    
    public void add(int key) {
        int hash = key%SIZE;
        LinkedList<Integer> bucket = buckets[hash];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int hash = key%SIZE;
        LinkedList<Integer> bucket = buckets[hash];
        bucket.remove((Integer) key);
            
    }   
    
    public boolean contains(int key) {
        int hash = key%SIZE;
        LinkedList<Integer> bucket = buckets[hash];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */