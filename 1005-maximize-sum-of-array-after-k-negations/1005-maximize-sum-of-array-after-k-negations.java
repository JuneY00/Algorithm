class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
            
        // [-4, -3, 1, 2, 5 ]
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > -1){
                result+=nums[i];
            }else if(nums[i] < 0 && k > 0){
                nums[i] *=-1;    
                result += nums[i];
                k--; 
            }else{ // nums[i] < 0 but, k < 0 
                result += nums[i];
            }   
        }
        
        Arrays.sort(nums);
        
        if(k > 0 && k%2 == 1){
            result += (nums[0]*-1)*2;
        }
    
        return result;
        
    }
}