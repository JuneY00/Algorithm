class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> billsMap = new HashMap<Integer, Integer>();
        
        // initialize billsMap 
        billsMap.put(5,0);
        billsMap.put(10,0);
        billsMap.put(20,0);
        
        
        for(int b : bills){
            if(b == 5){
                if(billsMap.get(5) >= 0){
                    billsMap.put(b, billsMap.get(b)+1);
                }
            }
            else if(b == 10){
                if(billsMap.get(5) > 0){
                    billsMap.put(b, billsMap.get(b) +1);
                    billsMap.put(5, billsMap.get(5) -1);
                }else{
                    return false;
                }
            }
            else if(b == 20){
                
                if(billsMap.get(10) > 0 && billsMap.get(5) > 0){
                    billsMap.put(b, billsMap.get(b) +1);
                    billsMap.put(10, billsMap.get(10) -1);
                    billsMap.put(5, billsMap.get(5) -1);
                }else if(billsMap.get(5) > 2){
                    billsMap.put(b, billsMap.get(b) +1);
                    billsMap.put(5, billsMap.get(5) -3);
                }else{
                    return false;
                }
            }
            
        }
        return true;
    }
}