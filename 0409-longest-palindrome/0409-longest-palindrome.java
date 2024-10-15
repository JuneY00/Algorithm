class Solution {
    public int longestPalindrome(String s) {
        
        int[] charCount = new int[128]; // array to store frequency of characters 
        int maxLength = 0; 
        boolean hasOdd = false; // check if there's a odd number 
        
        // count the frequency of each character 
        for(char c: s.toCharArray()){
            charCount[c]++;
        }
        
        for(int count: charCount){
            maxLength += count/2*2; // add only even number part of the count 
            if(count%2 ==1 ){
                hasOdd = true;
            }
        }
        
        if(hasOdd){
            maxLength++;
        }
        
        return maxLength;
        
    }
}