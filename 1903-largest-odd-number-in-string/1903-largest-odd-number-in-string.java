class Solution {
    public String largestOddNumber(String num) {
        
        StringBuilder result = new StringBuilder(num);
        
        for(int i = result.length() - 1 ; i >= 0 ; i--){
            int n = result.charAt(i) - '0';
            
            if( n % 2 == 1){
                return result.toString();
            }else{
                result.deleteCharAt(i);
            }
        }
        return "";
    }
}