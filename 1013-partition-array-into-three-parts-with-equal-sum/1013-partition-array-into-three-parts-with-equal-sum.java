class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {

        int totalSum = 0;
        
        for(int num:arr){
            totalSum += num;
        }
        
        if(totalSum%3 !=0){
            return false;
        }
        
        int targetSum = totalSum/3;
        int currSum = 0;
        int partsFound = 0;
        
        System.out.println(targetSum);
        
        for(int num : arr){
            currSum += num;
            
            if(currSum == targetSum){
                partsFound++;
                currSum = 0;
            }
            
            if(partsFound == 3){
                return true;
            }
        }
        
        return false;
    }
}

/*
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {

        int[] arrSum = new int[arr.length];
        arrSum[0] = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            arrSum[i] = arr[i]+arrSum[i-1];
            System.out.println(arrSum[i]);
        }
        
        for(int j = 1 ; j < arr.length-1; j++){
            for(int k = j+1; k < arr.length; k++){
                
                int k_n = arrSum[arr.length-1]-arrSum[k-1];
                int j_k = arrSum[k-1] - arrSum[j-1];
                int i_j = arrSum[j-1];
                
                if((k_n == j_k) && (k_n== i_j) && (j_k == i_j)){
                    return true;
                }
            }
        }
        return false;
    }
}
*/