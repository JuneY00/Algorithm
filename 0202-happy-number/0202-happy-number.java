class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> visit = new HashSet<>();
        
        // check if there's a cycle 
        while(!visit.contains(n)){
            visit.add(n);
            n = getNextNumber(n);
            
            // if n is 1, then it is true 
            if(n==1){
                return true;
            }
        }
        return false;
    }
    
    private int getNextNumber(int n){
        int result = 0;
        
        while(n > 0){        
            int digit = n%10; 
            result += digit*digit;
            n = n/10;
        }
        return result; 
    }
}
