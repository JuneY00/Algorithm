class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // array sort  
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0; 
        
        int g_pointer = g.length-1;
        int s_pointer = s.length-1; 
        
        while(s_pointer >= 0 && g_pointer >= 0){
            if(g[g_pointer] > s[s_pointer]){
                g_pointer--;
            }else{
                g_pointer--;
                s_pointer--;
                count++;
            }
        }
        
        return count;
                        
    }
}