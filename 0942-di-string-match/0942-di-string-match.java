/*
    s[i] == 'I', perm[i] < perm[i+1]
    s[i] == 'D', perm[i] > perm[i+1]
    Example: s = "IDID"

    Initial permutation: [0, 1, 2, 3, 4]
    
    After applying "IDID":
    [0, 4, 1, 3, 2]

    1. s[0] = 'I' (perm[0] < perm[1])
       So, perm[0] should be the smallest available number.
       perm[0] = 0
       
    2. s[1] = 'D' (perm[1] > perm[2])
       So, perm[1] should be the largest available number.
       perm[1] = 4
       
    3. s[2] = 'I' (perm[2] < perm[3])
       So, perm[2] should be the next smallest available number.
       perm[2] = 1
       
    4. s[3] = 'D' (perm[3] > perm[4])
       So, perm[3] should be the next largest available number,
       and perm[4] should be the next smallest available number.
       perm[3] = 3
       perm[4] = 2
*/


class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];  
        int min = 0, max = n;  // min and max pointers for smallest and largest available numbers

        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min++;  // Assign the smallest available number for 'I'
            } else {
                result[i] = max--;  // Assign the largest available number for 'D'
            }
        }
        result[n] = min;  // The last element can be either min or max (both are equal at this point)

        return result;
    }
}
