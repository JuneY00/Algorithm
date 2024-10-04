class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int s_len = skill.length;
        int chemistry = skill[0] + skill[s_len-1]; 
        long result = 0;
     
        for(int i = 0; i < s_len/2; i++){
            
            if(skill[i] + skill[s_len-1-i] != chemistry){
                return -1;
            }
            
            result += (long)skill[i]*skill[s_len-1-i];            
        }
        return result;
    }
    
}