class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g); // Sort the greed array
        Arrays.sort(s); // Sort the cookies array
        
        int count = 0; //count how many children are content
        
        // Pointers starting from the last element of both arrays
        int g_pointer = g.length - 1; 
        int s_pointer = s.length - 1; 
        

        while (s_pointer >= 0 && g_pointer >= 0) {
            // If the current child's greed is greater than the current cookie size
            if (g[g_pointer] > s[s_pointer]) {
                g_pointer--; // Move to the next (less greedy) child
            } else {
                // If the current cookie satisfies the current child
                g_pointer--; // Move to the next child
                s_pointer--; // Move to the next cookie
                count++; // Increment the count of content children
            }
        }
        
        return count; 
    }
}
