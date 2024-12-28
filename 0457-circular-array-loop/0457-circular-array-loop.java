class Solution {
    public boolean circularArrayLoop(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            
            // check if nums[i] has already been visited 
            if(nums[i] == 0 ){
                continue;
            }
            
            int direction = nums[i]; // current direction
            int slow = i;
            int fast = i; 
            
            while(true){
                slow = nextStep(nums, slow, direction);
                fast = nextStep(nums, fast, direction);
                
                if(fast != -1){
                    fast = nextStep(nums, fast, direction);
                }
                
                // if any pointer is invalid or the direction changes, break 
                if(slow == -1 || fast == -1){
                    break;
                }
                                
                // if slow pointer equals fast pointer, a cycle is detected 
                if(slow==fast){
                    // if the cycle length is 1, it's not a valid cycle 
                    if(slow == nextStep(nums,slow,direction)){
                        break;
                    }
                    return true;
                }                
            }
            
            // if no cycle is found, mark all visited indices as 0 
            int curr = i;
            while(curr != -1 && nums[curr] * direction > 0){
                int next_idx = nextStep(nums, curr, direction);
                nums[curr] = 0; // mark the index as visited 
                curr = next_idx;
            }                    
        }
        return false; // no cycle found in the entire array
    }
    
    private int nextStep(int[] nums, int currIdx, int direction){
        int n = nums.length;
        int idx = ((nums[currIdx] + currIdx) % n + n ) % n;

        // if the direction changes or the pointer doesn't move, return -1 
        if(direction*nums[idx] <= 0 || idx == currIdx){
            return -1;
        }
            
        return idx;
    }
}