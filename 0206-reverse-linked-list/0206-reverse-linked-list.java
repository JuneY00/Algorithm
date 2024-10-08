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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        
        List<Integer> reversed_list = new ArrayList<>();
        ListNode reverse = new ListNode(0);
        ListNode curr = reverse;
        
        while(head !=null ){
            reversed_list.add(head.val);
            head = head.next;
        }
 
        
        for(int i = reversed_list.size()-1; i > -1; i--){
            System.out.println(reversed_list.get(i));
            curr.next = new ListNode(reversed_list.get(i));
            curr = curr.next;
        }
        
        return reverse.next;
    }
}