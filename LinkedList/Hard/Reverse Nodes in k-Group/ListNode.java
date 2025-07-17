
//  Definition for singly-linked list.
public class ListNode {
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

// CODE FROM HERE

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int i = size - n;

        if (size == n) {
            return head.next;
        }

        ListNode curr = head;
        int currsize = 1;
        while (currsize < i) {
            currsize++;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

    }

}
