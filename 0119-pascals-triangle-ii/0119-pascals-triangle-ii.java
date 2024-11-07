class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> dp = new ArrayList<>();
        
        dp.add(new ArrayList<>());
        dp.get(0).add(1);
        
        if(rowIndex == 0){
            return dp.get(0); 
        }
        
        
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> prev_row = dp.get(i-1);
            List<Integer> now_row = new ArrayList<>();
            now_row.add(1);
            
            for(int j = 1; j< i; j++){
                now_row.add(prev_row.get(j-1)+prev_row.get(j));    
            }
            now_row.add(1);
            dp.add(now_row);
        }
        return dp.get(rowIndex);
    }
}
