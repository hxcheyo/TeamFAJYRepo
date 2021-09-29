/* Ahmad N. Elhajj
 * ane6td
 */

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
        ListNode leading = new ListNode(n), following = new ListNode(n);
        leading.next = head; // pointer 1
        following.next = head; // pointer 2
        while (leading != null) { // moves pointer until null
            leading = leading.next;
            if (n < 0) following = following.next; // iterates following based on input n
            n--;
        }
        if (following.next == head) { // re-assigns head node based on current position
            head = following.next.next;
        }
        else following.next = following.next.next; // re-assigns head node based on current position
        return head;
    }
}