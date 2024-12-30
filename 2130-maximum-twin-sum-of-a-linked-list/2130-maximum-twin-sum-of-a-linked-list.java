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
        
        // find the half of the head 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the slow 
        ListNode curr = slow;
        ListNode prev = null;
        ListNode temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
        }
        
        int result = 0; 
        
        while(prev != null ){
            result = Math.max(result, prev.val + head.val);
            prev = prev.next;
            head = head.next;
        }
        return result;
    }
}