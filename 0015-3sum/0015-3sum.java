class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
        // Define a set to store unique triplets and avoid duplicates 
        Set<List<Integer>> result = new HashSet<>();
           
        // Sort the array to simplify the two-pointer approach 
        Arrays.sort(nums);        
    
        // Iterate through the array, fixing one element (num[i]) at a time 
        for(int i = 0; i < nums.length-2; i++){
            
            // skip duplicate values for the fixed element 
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            // Initialize two pointers for the two-sum problems 
            int start = i+1;
            int end = nums.length-1; 
            
            // Use two pointer approach to find pairs that sum to -num[i]
            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    
                    // Skip duplicate values for the start pointer 
                    while(start<end && nums[start] == nums[start-1]) start++;
                    
                    // Skip duplicate values for the end pointer
                    while(start<end && nums[end]==nums[end+1]) end--; 
                    
                }else if(sum<0){ 
                    // if the sum is less than zero, move the start pointer to increase the sum
                    start++; 
                    
                }else{
                    // if the sum is less than zero, move the end pointer to decrease the sum
                    end--;
                }
            }
            
        }
        
        return new ArrayList<>(result);
    }
}