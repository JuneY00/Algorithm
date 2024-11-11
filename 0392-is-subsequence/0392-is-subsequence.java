// class Solution {
//     public boolean isSubsequence(String s, String t) {
       
//         int s_index=0 , t_index = 0;
        
//         while(s_index < s.length() && t_index < t.length()){
//             if(s.charAt(s_index) == t.charAt(t_index)){
//                 s_index++;
//             }
//             t_index++;
//         }
        
//         return s_index == s.length();
        
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean[] dp = new boolean[s.length()];
        Arrays.fill(dp,false);
        int t_index = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            while(t_index < t.length()){
                if(s.charAt(i) == t.charAt(t_index)){
                    dp[i] = true;
                    t_index++;
                    break;
                }                
                t_index++;
            }
            if(dp[i] == false){
                return false;
            }
        }
        
        return true;
    }
}