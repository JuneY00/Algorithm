class Solution {
    public boolean isPalindrome(String s) {
        
        // use two pointers (start, end)
        int start = 0;
        int end = s.length()-1;
        
        
        while(start <= end){
            // convert letters into lowercase 
            char currStart = Character.toLowerCase(s.charAt(start));
            char currEnd = Character.toLowerCase(s.charAt(end));
            
                    
            if(!Character.isLetterOrDigit(currStart)){
                start++;
            }else if(!Character.isLetterOrDigit(currEnd)){
                end--; 
            }else{
            
                if(currStart != currEnd){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
        }
        
        return true; 
    }
}
