package hard;

import common.ListNode;

public class TestHard {
    public void runTests() {
        MergeKSortedLists testMergeKSortedList = new MergeKSortedLists();
        System.out.println("testMergeKSortedList: " + testMergeKSortedList.mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))), new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))}));
    }

}
