class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int minValue = Integer.MAX_VALUE;
        
            
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0 && k > 0){ // nums[i] < 0 && k > 0 
                nums[i] *=-1;    
                k--; 
            } 
            // else (nums[i] < 0 but, k < 0)  or nums[i] > 0 
            result += nums[i];
            minValue = Math.min(minValue, nums[i]);
        }
        
        if(k%2 == 1){
            result -= minValue*2; 
        }
    
        return result;
        
    }
}