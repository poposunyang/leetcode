/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode now = new ListNode();
        ListNode list3 = now;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                now.next = new ListNode(list1.val);
                now = now.next;
                list1 = list1.next;
            } else {
                now.next = new ListNode(list2.val);
                now = now.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            now.next = list2;
        } else if (list2 == null) {
            now.next = list1;
        }
        return list3.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}