class Solution {
    
    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;
        int count = 0;
        
        
        while(left < right){
            
            if(s.charAt(left)!=s.charAt(right)){
                String delLeft = s.substring(0,left)+s.substring(left+1,s.length());
                String delRight = s.substring(0,right)+s.substring(right+1,s.length());
            
                System.out.println(delLeft);
                System.out.println(delRight);
                
                if(isPalindrome(delLeft) || isPalindrome(delRight)){
                    return true;
                }else{
                    return false;
                }
            }
                   
            left++;
            right--;
             
         }
        return true;
    }
}