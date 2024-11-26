class Solution {
    public int mySqrt(int x) {
        
        if(x == 0 || x == 1){
            return x;
        }
        
        int start = 0;
        int end = x;
        int mid = 0; 
        
        while(start <= end){
            mid = start+(end-start) /2;
            long squre = (long)mid*mid;
            
            if(squre==x){
                return mid;
            }else if(squre < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
    
        return  end;
    } 
}