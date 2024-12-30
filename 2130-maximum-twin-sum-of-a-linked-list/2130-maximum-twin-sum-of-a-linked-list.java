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
    public int pairSum(ListNode head) {
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        // find the middle of the Linked list 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the linked list starting from slow  
        ListNode curr = slow;
        ListNode prev = null;
        ListNode temp = null;
        
        // Reverse the list using a loop 
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
        }
        
        int result = 0; 
        
        // compare the nodes from the reversed second half with the first half
        while(prev != null ){
            // calculate the sum of the current pair and update the maximum
            result = Math.max(result, prev.val + head.val);
            prev = prev.next;
            head = head.next;
        }
        return result;
    }
}