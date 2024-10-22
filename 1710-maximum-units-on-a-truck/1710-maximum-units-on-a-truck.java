class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort the boxTypes array in descending order based on the number of units per box 
        Arrays.sort(boxTypes, (a,b) ->  b[1]-a[1]);
        
        int result = 0;
        
        // iterate over each box type
        for(int i = 0; i<boxTypes.length; i++){

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