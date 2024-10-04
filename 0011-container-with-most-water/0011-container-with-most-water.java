class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        
        
        while(left<right){
            
            int h = Math.min(height[right],height[left]);
            int v = right-left;
            
            max = Math.max(max, v*h);
            
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return max;    
        
    }
}