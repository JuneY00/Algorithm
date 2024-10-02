
class Solution {
    public int strStr(String haystack, String needle) {

        // if needle's length is larger than haystack 
        if(haystack.length() < needle.length()){
            return -1;
        }
    
        for(int i = 0; i < haystack.length()-needle.length()+1; i++){   
           
            int index = i;
            
            for(int j = 0; j < needle.length(); j++){
                
                if(index >= haystack.length()) return -1;
                
                if(needle.charAt(j) == haystack.charAt(index))
                {   
                    if(j == needle.length()-1) return i;
                    index++;
                }
                else {
                    break;
                    
                }
            }
        }

        return -1;
    }
}