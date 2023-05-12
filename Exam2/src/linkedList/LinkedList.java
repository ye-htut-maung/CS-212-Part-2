package linkedList;

public class LinkedList {
   ListNode first;
   ListNode last;
   int length;
  
   public LinkedList() {
      ListNode n = new ListNode();
      first = n;
      last = n;
      length = 0;
   }
   
   public void append(String d) {
      ListNode ln = new ListNode(d);
      last.next = ln;
      last = ln;
      length++;
   }
   
   public void prepend(String d) {
      ListNode ln = new ListNode(d);
      ln.next = first.next;
      first.next = ln;
      length++;
      if (first == last) {
         last = ln;
      }
      
   }
   
   public void printAll() {
      ListNode ln = new ListNode();
      ln = first.next;
      while (ln != null) {
         System.out.println(ln.data);
         ln = ln.next;
      }
      
   }
   public LinkedListIterator reset() {
      return new LinkedListIterator(first.next);
   }
}
