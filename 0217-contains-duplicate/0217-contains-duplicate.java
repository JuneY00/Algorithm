class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
//         for(int num: nums){
//             if(numSet.contains(num)){
//                 return true;
//             }
//             numSet.add(num);
//         }
        
//         return false;
        
        for(int num: nums){
            numSet.add(num);
        }
        return numSet.size() < nums.length;
    }
}
