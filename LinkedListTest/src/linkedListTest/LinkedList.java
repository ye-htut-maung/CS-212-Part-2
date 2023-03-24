package linkedListTest;

public class LinkedList {
   ListNode ln = new ListNode();
   private ListNode first = ln;
   private ListNode last = ln;
   private int length = 0;
   
   public void append (String s) {
      ListNode n = new ListNode(s);
      last.next = n;
      last = n;
      length++;
   }
   public void printList() {
      ListNode p = first.next;
      while (p != null) {
         System.out.println(p.data);
         p = p.next;
      }
   }
   
   public LinkedListIterator reset() {
      return new LinkedListIterator(first.next);
   }
   
   

   
   
   
}
