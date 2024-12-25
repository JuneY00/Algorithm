class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
    
        
        for(int i = 0; i<= high; i++){
            
            // if current number is 0
            if(nums[i] == 0){
                // swap with the number at the low index
                swap(nums, low, i);
                // move the low pointer forward 
                low++;
            }
            // if the current number is 2
            if(nums[i] == 2){
                
                // swap with the number at the high index
                swap(nums, high, i);
                
                // move the high pointer backward  
                high--;
                
                // decrease i to check the swapped value at index i 
                
                i--;
            }
            // If nums[i] is 1, do nothing and just move to the next index 
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}