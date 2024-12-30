/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */



class Solution {
    public boolean isPalindrome(ListNode head) {
       
        if(head == null){
            return false;
        }
        
        // find the middle of the linked list 
        ListNode slow = head;
        ListNode fast = head;
        
        // slow is the middle of the linked list 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode temp = null;
        ListNode prev = null;

        // 2. Reverse the second half of the linked list
        while(curr != null){
            temp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = temp;             
        }
        
        
        // 3. Compare the two halves
        while(prev != null){
            System.out.println(head.val + " "+ prev.val);
            if(head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
        
    }
}