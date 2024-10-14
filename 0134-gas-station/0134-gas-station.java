class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    
        int totalCost = 0;;
        int totalGas = 0; 
        int currGas = 0;
        int startIndex =0;
        
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            currGas += gas[i]-cost[i];
            
            if(currGas < 0){
                currGas = 0;
                startIndex = i+1;
            }
        }
        
        if(totalGas < totalCost){
            return -1;
        }
    
        return startIndex;
    }
}