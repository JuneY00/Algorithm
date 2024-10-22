class Solution {
    public String maximumTime(String time) {
    
        StringBuilder result = new StringBuilder(time);
        
        // Determine the first character
        // if it is '?', decide based on the second character 
        
        if(result.charAt(0) == '?'){
            // if result[1] is 0-3, then the maximum value for result[0] is '2';
            // otherwise, it is '1' 
            result.setCharAt(0, (result.charAt(1) == '?' || result.charAt(1) <='3') ? '2' : '1');
        }
        
        // Determine the second character 
        // if it is '?', decide based on the first character 

        if(result.charAt(1) == '?'){
            // if result[0] is 2, then the maximum value for result[1] is '3';
            // otherwise, it is '9' 
            result.setCharAt(1, (result.charAt(0) == '?' || result.charAt(0) =='2') ? '3' : '9');
        }
        
        if(result.charAt(3) == '?'){
            result.setCharAt(3, '5');    
        }
        
        if(result.charAt(4) == '?'){
            result.setCharAt(4,'9');
        }
        
        return result.toString();
    }
}