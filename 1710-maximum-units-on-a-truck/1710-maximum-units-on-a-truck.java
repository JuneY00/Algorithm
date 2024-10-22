class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (o1, o2) -> {
            return o2[1]-o1[1];
        });
        
        int result = 0;
        
        for(int i = 0; i<boxTypes.length; i++){
                System.out.println(boxTypes[i][0]);

                if(truckSize >= boxTypes[i][0] ){
                    result +=  boxTypes[i][0]*boxTypes[i][1];
                    truckSize -= boxTypes[i][0];
                    
                }else{
                    result += truckSize*boxTypes[i][1];
                    return result;
                }
        }
        
        return result;
    }

}