import java.util.Hashtable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        // Add all nums elements to a HashSet for fast lookup
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            numSet.add(num);
        }
        
        int result = 0;
        ListNode curr = head;
        
        // Step 2: Traverse the linked list
        // If current node is in nums and the next node is either null or not in nums

        while(curr !=null){
            if(numSet.contains(curr.val) 
               && (curr.next ==null || !numSet.contains(curr.next.val))){ 
                result++;
            }
             curr = curr.next;
           }
    
       return result;
               
    }
}