package linkedListTest;

public class ListNode {
   String data;
   ListNode next;
   public ListNode (String d, ListNode ln) {
      data = d;
      next = ln;
   }// constructor
   public ListNode() {
      data = null;
      next = null;
   }
   public ListNode(String d) {
      data =d;
      next = null;
   }

} // class ListNode
