class Solution {
    
    public int[] countBits(int n) {
        
        int[] dp = new int[n+1];
        
        for(int i = 0; i<= n; i++){
            String binary = Integer.toBinaryString(i);
            dp[i] = binary.length() - binary.replace(String.valueOf('1'),"").length();
        }
        
        return dp;
    }
}