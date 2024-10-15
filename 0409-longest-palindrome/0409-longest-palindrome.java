class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        boolean oddFlag = false;
        int maxLength = 0; 
        
        if(s.length() == 1){
            return 1;
        }
        
        // initialize map with key(character), value(character's frequency)
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char key : map.keySet()){
            int value = map.get(key);
            
            // Longest Palindrome == max even number and max odd number 
            // if value is odd and odd is never occered
            if(value%2 != 0 && !oddFlag){
                maxLength +=value;
                oddFlag = true;
            }else if(value%2 != 0 && oddFlag){
                maxLength += (value-1);
            }else{
                maxLength += value;
            }
        }
        return maxLength;
        
    }
}