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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        
        /* get the head size */
        ListNode curr = head;
        int size = 0;  
        
        while(curr != null){
            size++;
            curr = curr.next;
        }

        /* get the node to be removed */
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        for(int i = 0; i < size; i++){
            if(i == size-n){
                current.next = current.next.next;
                break;
            }    
            current = current.next;
        }
        
        return dummy.next;
        
    }
}