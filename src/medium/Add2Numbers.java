package medium;

import common.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode currentNode = null;
        ListNode memNode = new ListNode(0);

        while(l1 != null || l2 != null) {
            if(result == null) {
                result = new ListNode((l1!=null?l1.val:0) + (l2!=null?l2.val:0));
                currentNode = result;
            }
            else {
                currentNode.next = new ListNode((l1!=null?l1.val:0) + (l2!=null?l2.val:0) + memNode.val);
                currentNode = currentNode.next;
            }

            if(currentNode.val > 9) {
                currentNode.val -= 10;
                memNode.val = 1;
            }
            else {
                memNode.val = 0;
            }
            if(l1 != null ) {l1 = l1.next;}
            if(l2 != null ) {l2 = l2.next;}
        }

        if(memNode.val == 1) {
            currentNode.next = new ListNode(1);
        }

        return result;
    }
}
