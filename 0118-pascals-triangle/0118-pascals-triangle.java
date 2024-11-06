class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        if(numRows == 0) return dp; 
        
        dp.add(new ArrayList<>());
        dp.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> prev_row = dp.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            
            for(int j = 1; j < prev_row.size(); j++){
                curr_row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            
            curr_row.add(1);
            dp.add(curr_row);
        }
        
        return dp; 
    }
}