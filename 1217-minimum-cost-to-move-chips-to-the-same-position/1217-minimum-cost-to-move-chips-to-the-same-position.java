class Solution {
    public int minCostToMoveChips(int[] position) {
        // if you move 2 steps with one coin, then it costs zero 
        // if you move 1 step with one coin, then it costs one 
        HashMap<Integer, Integer> coins = new HashMap<Integer, Integer>();
        
        
        for(int n : position){
            coins.put(n, coins.getOrDefault(n,0)+1);
        }
        
        int even = 0;
        int odd = 0;
        int minVal = 0;
        
        for(Integer key : coins.keySet()){
            if(key % 2 == 0){
                even+=coins.get(key);
            }else{
                odd += coins.get(key);
            }
            minVal = Math.min(even,odd);
        }
        
        return minVal;
    }
}