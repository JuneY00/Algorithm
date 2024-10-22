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

/*
import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort the boxTypes array in descending order based on the number of units per box
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int result = 0;
        
        // Iterate over each box type
        for (int[] box : boxTypes) {
            // Determine the number of boxes that can be loaded into the truck
            int boxCount = Math.min(truckSize, box[0]);
            // Add the units from the current box type to the result
            result += boxCount * box[1];
            // Decrease the available truck space
            truckSize -= boxCount;
            
            // If the truck is full, stop the loop
            if (truckSize == 0) {
                break;
            }
        }
        
        return result;
    }
}

*/