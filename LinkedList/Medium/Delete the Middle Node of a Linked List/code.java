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

class code {
  public ListNode deleteMiddle(ListNode head) {

    int size = 0;
    ListNode temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }

    int deletenode = size / 2;

    if (size == 1) {
      return null;
    }

    ListNode prev;
    int currsize = 1;
    ListNode curr = head;

    while (currsize < deletenode) {
      currsize++;
      curr = curr.next;
    }

    curr.next = curr.next.next;
    
    return head;

  }
}