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
        // No need to process if the list is empty or only contains a single node
        if (head == null || head.next == null) {
            return null; 
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; // Pointer to track the new list being constructed
        int num = 0; // To accumulate values between zeros

        head = head.next; // Skip the initial zero

        while (head != null) {
            if (head.val == 0) {
                // When we encounter a zero, we add the accumulated sum as a new node
                curr.next = new ListNode(num);
                curr = curr.next;
                num = 0; // Reset the sum after inserting the node
            } else {
                // Keep adding values between zeros
                num += head.val;
            }
            head = head.next; // Move to the next node
        }

        return dummy.next; // Return the new list without the first dummy node
    }
}
