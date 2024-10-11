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
    

    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = dummy.next;
        
        while(curr != null && curr.next != null   ){
            
            // node swap 
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;
            
            // update prev and curr
            prev = curr;
            curr = curr.next;   
        }        
        
        return dummy.next;
    }
}