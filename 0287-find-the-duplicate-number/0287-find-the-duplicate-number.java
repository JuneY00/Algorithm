class Solution {
    public int findDuplicate(int[] nums) {
        
        // use slow and fast pointers to find the intersection point 
        int slow = nums[0];
        int fast = nums[0];
        
        // move slow by 1 step and fast by 2 steps until they meet 
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        
        // find the slow start of the cycle 
        int ptr1 = nums[0];
        int ptr2 = slow;
        
        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        
        
        return ptr1;
        
            
    }
}