class Solution {
    public String largestOddNumber(String num) {
        
        // use StringBuilder to work with the string efficiently
        StringBuilder result = new StringBuilder(num);
        
        // Iterate from the end of the string to the start 
        for(int i = result.length() - 1 ; i >= 0 ; i--){
            int n = result.charAt(i) - '0';
            
            // If the current digit is odd, return the substring up to this point 
            if( n % 2 == 1){
                return result.substring(0,i+1);
            }
        }
        // if no odd number is found, return an empty string 
        return "";
    }
}