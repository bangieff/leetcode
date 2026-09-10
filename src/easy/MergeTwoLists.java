  package easy;

import common.ListNode;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode currentNode = null;

        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        while(list1 != null && list2 != null) {
            if(result==null) {
                result = new ListNode();
                currentNode = result;
            }
            else {
                currentNode.next = new ListNode();;
                currentNode = currentNode.next;
            }

            if(list1.val < list2.val) {
                currentNode.val = list1.val;
                list1 = list1.next;
            }
            else {
                currentNode.val = list2.val;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            currentNode.next = list2;
        } else {
            currentNode.next = list1;
        }

        return result;
    }
}
