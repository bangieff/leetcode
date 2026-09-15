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
        String result = "";

        ListNode current = this;
        while(current != null) {
            result +=  result.isEmpty()?current.val:" -> " + current.val;
            current = current.next;
        }

        return result;
    }
}
