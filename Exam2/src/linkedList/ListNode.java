package linkedList;

public class ListNode {
   ListNode next;
   String data;
   
   public ListNode() {
      next = null;
      data = null;
   }
   
   public ListNode (String d) {
      data = d;
      next = null;
   }
   public ListNode(ListNode n, String d) {
      next = n;
      data = d;
   }
}
