
// Definition for singly-linked list.
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

  public class Solution {
    public ListNode removeElements(ListNode head, int val) {
      ListNode temp = new ListNode(0);
      temp.next = head;

      if (head == null) {
        return null;
      }

      ListNode prev = temp;
      ListNode curr = head;
      while (curr != null) {
        if (curr.val == val) {
          prev.next = curr.next;
        } else {
          prev = curr;
        }
        curr = curr.next;
      }
      head = temp.next;

      return head;
    }
  }
}