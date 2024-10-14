class Solution {
    public boolean canJump(int[] nums) {
        int target = nums.length-1; // last index 
        int maxJump = 0; // the farthest index we can currently reach 
        
        for(int i= 0; i < nums.length; i++){
            
            if(i>maxJump){
                // if the current index is beyond the farthest index we can reach, return false 
                return false;
            }
            
            // update the farthest index we can reach from the current position 
            maxJump = Math.max(maxJump, i+nums[i]);
            
            // if the farthest index we can reach is beyond or at the last index, return true 
            if(maxJump >= nums.length-1){
                return true;
            }
        }
        
        // if we finish the loop and haven't reached the last index, return false
        return false; 
    }
}