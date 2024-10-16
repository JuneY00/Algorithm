class Solution {
    public int[] diStringMatch(String s) {
        
        /*
        
        s[i] == I, perm[i]<perm[i+1]
        s[i]== D, perm[i] > perm[i+1]
        s = "IDID"
        
        [0,1,2,3,4]
        [0,1,2,3,4] 
        [0,4,1,2,3]

        1. s[0] = I  (n[0] < n[1] )
            so, n[0] should be the smallest digit
            n[0] = 0
        2. s[1] = D (n[1] > n[2])
            so, n[1] should be the largest digit 
            n[1] = 4 
        3. s[2] = I (n[2] < n[3])
            so, n[2] should be next smallest digit 
            n[2] = 1 
        4. s[3] = D (n[3] > n[4])
            so, n[3] should be next largest digit
            abd n[4] should be the next smallest digit 
            n[3] = 3 
            n[4] = 2

        */

        int[] n = new int[s.length()+1];
        int max = s.length();
        int min = 0;
         char c = '\0';

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            
            if(c == 'I'){
                n[i] = min;
                min++;
            }else{
                n[i] = max;
                max--;
            }
        }
        
        if(c == 'I'){
            n[s.length()] = max;
        }else{
            n[s.length()] = min;
        }
        
        
        
        return n;
        
    }
}