
// Definition for singly-linked list.
public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  // solution from here

  public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode temp = headA;
      while (temp != null) {
        ListNode temp2 = headB;
        while (temp2 != null) {
          if (temp == temp2) {
            return temp2;
          }
          temp2 = temp2.next;
        }
        temp = temp.next;
      }
      return null;
    }
  }

}