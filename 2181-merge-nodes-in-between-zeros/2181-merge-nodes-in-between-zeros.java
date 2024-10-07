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
    public ListNode mergeNodes(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int num = 0;
        
        while(head !=null){

            if(head.val == 0){
                curr.next = new ListNode(num);
                curr = curr.next;
                System.out.println(num);
                num = 0;
            }else{
                num += head.val;
            }
            head = head.next;
        }
        return dummy.next.next;
        
    }
}