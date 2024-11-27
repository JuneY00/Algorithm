class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty()){
            return false;
        }
        
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            
            if(!Character.isLetterOrDigit(currStart)){
                start++;
            }else if(!Character.isLetterOrDigit(currEnd)){
                end--;
            }else{
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd)){
                    System.out.println(currStart+" "+ currEnd);
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


