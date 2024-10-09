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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // 1. Find the middle of the linked list
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // 2. Reverse the second half of the linked list
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = slow;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
            
        
        ListNode left = head;
        ListNode right = prev;
        
        // 3. Compare the two halves
        while(right !=null){
            if(left.val != right.val){
                return false;
            }
            
            left = left.next;
            right = right.next;

        }
        
        return true;
    }
}