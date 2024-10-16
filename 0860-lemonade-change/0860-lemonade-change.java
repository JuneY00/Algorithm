class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        
        
        for(int b : bills){
            if(b == 5){
                fiveCount++;
            }
            else if(b == 10){
                if(fiveCount > 0){
                    fiveCount--;
                    tenCount++;
                }else{
                    return false;
                }
            }
            else {
                if(tenCount > 0 && fiveCount > 0){
                    fiveCount--;
                    tenCount--;
                }else if(fiveCount>2){
                    fiveCount -=3;
                    
                }else{
                    return false;
                }
            }
            
        }
        return true;
    }
}