class Solution {
    public int scoreOfString(String s) {
        int result = 0; 
        for(int i =0; i < s.length()-1; i++){
            int ascii = s.charAt(i); 
            result += Math.abs(s.charAt(i)- s.charAt(i+1));
        }
        System.out.println(result);
        return result; 
    }
}