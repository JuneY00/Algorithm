class Solution {
    public String convertToTitle(int columnNumber) {
     
        StringBuffer sb = new StringBuffer();
        
        while(columnNumber > 0){
            columnNumber--;
            int remainder = columnNumber%26;
            char currChar = (char)(remainder+'A');
            sb.append(currChar);
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}