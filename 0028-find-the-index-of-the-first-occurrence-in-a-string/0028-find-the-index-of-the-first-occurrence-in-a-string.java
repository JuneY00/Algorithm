

class Solution {
    public int strStr(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();

        int i = 0;
        int j = 0;

        while(i<hLen){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
                if(j == nLen){
                    return i-nLen+1; 
                }
            }
            else{
                i = i-j;
                j = 0;

            }
            i++;
        }
        
        return -1;
    }
}
