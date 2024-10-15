import java.util.HashMap;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {

        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        Stack<Character> stack = new Stack();
        boolean[] inStack = new boolean[26]; // alphabet 
        
        for(char c : s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        
        for(char c: s.toCharArray()){
            freqMap.put(c,freqMap.get(c)-1);

            if(inStack[c-'a']){
                continue;
            }
            
            while(!stack.isEmpty() && stack.peek() > c && freqMap.get(stack.peek()) > 0){
                inStack[stack.pop()-'a'] = false;
                
            }          
        
            stack.push(c);
            inStack[c-'a']=true;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString(); 
    }
}
