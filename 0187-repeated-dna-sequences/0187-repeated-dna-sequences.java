class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        
        int length = 10;
        
        for(int i = 0; i <= s.length()-length; i++){
            
            String substr = s.substring(i, i+length);
            
            if(seen.contains(substr)){
                repeated.add(substr);
            }else{
                seen.add(substr);
            }
        }
        
        for(String i : seen){
            System.out.println(i);
        }
        
        return  new ArrayList<>(repeated);
    }
}