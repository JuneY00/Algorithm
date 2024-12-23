class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
        // define set to remove duplicated lists
        Set<List<Integer>> result = new HashSet<>();
           
        // to use binarysearch, we need to sort the array 
        Arrays.sort(nums);        
    
        
        for(int i = 0; i < nums.length-2; i++){
            
            // skip duplicate number
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int start = i+1;
            int end = nums.length-1; 
            
            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    
                    // skip duplicate number 
                    while(start<end && nums[start] == nums[start-1]) start++;
                    while(start<end && nums[end]==nums[end+1]) end--; 
                    
                }else if(sum<0){ // if sum is less than zero, raise number by increasing start index 
                    start++; 
                    
                }else{
                    end--;
                }
            }
            
        }
        
        return new ArrayList<>(result);
    }
}