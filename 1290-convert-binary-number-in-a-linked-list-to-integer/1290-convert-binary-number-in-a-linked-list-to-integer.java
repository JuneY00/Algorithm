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
    public int getDecimalValue(ListNode head) {
        String binary = "";

        
        while(head!=null){
            binary += Integer.toString(head.val);
            head = head.next;
        }
        
        System.out.println(binary);

        return Integer.parseInt(binary, 2);
    }
}