package common;

/* Definition for singly-linked list.
        * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ListNode current = this;
        while(current != null) {
            if(!sb.isEmpty()) {
                sb.append(" -> ");
            }
            sb.append(current.val);
            current = current.next;
        }

        return sb.toString();
    }
}
