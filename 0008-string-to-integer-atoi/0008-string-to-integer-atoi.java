class Solution {
    
    /**
       aim to convert a string to a 32-bit signed integer 
        
        1. ignore any leading whitespace " "
        
        2. checking if the next character is '-' 
        
        3. ignore the leading zero and read the integer until a non-digit character is 
        4. if integer should be ranged from -2^31 ~ 2^31-1. if the integer is less than or greater than that range, should be rounded.
        
     **/
    

    public int myAtoi(String s) {
        String str = s.trim(); // 1.  remove the white space
        if(str.isEmpty()) return 0; 

        int sign = 1;
        int i = 0;
        
        // 2. check if it is - or + 
        if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(str.charAt(i)=='+'){
            sign = 1;
            i++;
        }

        // 3. extract number 
        long result = 0;
        
        // if str.charAt(i) is not a number, then return 0 
        while(i < str.length() && Character.isDigit(str.charAt(i))){
            result = result*10 + (str.charAt(i)-'0'); // change string type to integer type 

            if(result*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(result*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return (int)result*sign;

    }
}