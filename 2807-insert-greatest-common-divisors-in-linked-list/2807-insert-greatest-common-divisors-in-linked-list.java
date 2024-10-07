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
    
    public Integer GCD(int n1, int n2){
        while(n1 != n2){
            if(n1>n2){
                n1 -=n2;
            }else{
                n2 -=n1;
            }
        }
        return n1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        
        while(curr !=null && curr.next !=null){
            int gcd = GCD(curr.val, curr.next.val);
            ListNode gcdNode = new ListNode(gcd);
            
            // Insert the new GCD node between curr and curr.next
            gcdNode.next = curr.next;
            curr.next = gcdNode;

            // Move to the next pair
            curr = gcdNode.next;
        }
        
        return head;
        
    }
}