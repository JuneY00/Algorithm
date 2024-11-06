/**
    
n = 1, 1 => 1 
n = 2,  =>  1 + 1 => 2
            2  
n = 3,  =>  1 + 1 + 1 => 3 
            1 + 2 
            2 + 1 
n = 4,  =>   1 + 1 + 1 + 1  => 5  
             1 + 2 + 1 
             2 + 1 + 1 
             1 + 1 + 2 
             2 + 2 
*/
class Solution {
    public int climbStairs(int n) {
        
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];  
    }
}
