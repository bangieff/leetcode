package hard;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
*/

import common.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode tail = null, result = null;
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < lists.length; i++) {
            while(lists[i] != null) {
                map.put(lists[i].val, map.getOrDefault(lists[i].val, 0) + 1);
                lists[i] = lists[i].next;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for(int i = 0; i < entry.getValue() ; i++) {
                if(tail == null) {
                    result = tail = new ListNode(entry.getKey());
                } else {
                    tail.next = new ListNode(entry.getKey());
                    tail = tail.next;
                }
            }
        }

        return result;
    }
}
