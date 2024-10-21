class Solution {
    public int balancedStringSplit(String s) {
        int r_cnt = 0;
        int l_cnt = 0;
        int result = 0;
        
        for(char c :s.toCharArray()){
            if(c == 'R'){
                r_cnt++;
            }else{
                l_cnt++;
            }
            
            if((r_cnt != 0 && l_cnt != 0) && r_cnt == l_cnt){
                result++;
                r_cnt = 0;
                l_cnt = 0;
            }
        }
        
        return result;
    }
}