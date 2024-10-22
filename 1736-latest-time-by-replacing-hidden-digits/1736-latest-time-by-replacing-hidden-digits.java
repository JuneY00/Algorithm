class Solution {
    public String maximumTime(String time) {
    
        char a = time.charAt(0);    // if b is 0-3 then, 2 is max, else 1 is max 
        char b = time.charAt(1);  // if a is 2 then, 3 is max, else 9 is max 
        char c = time.charAt(3); // max is always 5 
        char d = time.charAt(4); // max is always 9 
        String result = "";
        
        if(a == '?'){
            if(b =='?' || b == '0' || b == '1' || b == '2' || b == '3'){
                a = '2';
            }else{
                a = '1';
            }
        }
        
        if(b == '?'){
            if(a == '?' || a =='2'){
                b = '3';
            }else{
                b = '9';
            }
        }
        
        if(c == '?'){
            c = '5';
        }
        
        if(d == '?'){
            d ='9';
        }
        
        return "" + a + b + ":" + c + d;
    }
}