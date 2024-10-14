class Solution {
    public int jump(int[] nums) {
        int target = nums.length-1;
        int jumpRange = 0;
        int farthest = 0;
        int count = 0; 
        
        for(int i = 0; i < target; i++){
            farthest = Math.max(farthest, i+nums[i]);
            
            // if i is at the end of the jumpRange, have to jump 
            if(i == jumpRange){
                jumpRange = farthest;
                count++;
                
                if(farthest >= target){
                    break;
                }
            }
        }
        
        return count;
        
    }
}


