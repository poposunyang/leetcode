import java.util.ArrayList;

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

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ArrayList<ListNode> listNodelist = new ArrayList<ListNode>();
        for (ListNode now = head; now != null; now = now.next) {
            listNodelist.add(now);
            count++;
        }
        return listNodelist.get(count / 2);
    }

    public ListNode middleNodeLowFast(ListNode head) {
        // 采用快慢指针进行实现
        if (head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // 当前fast走到最后
        return slow;
    }
}