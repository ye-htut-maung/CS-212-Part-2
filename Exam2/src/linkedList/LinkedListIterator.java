package linkedList;

public class LinkedListIterator {
   ListNode ln;
   String currentData;
   public LinkedListIterator(ListNode first) {
      ln = first;
   }
   
   public boolean hasNode() {
      return ln != null;
   }
   
   public String next() {
      if (ln == null) {
         throw new NullPointerException("null pointer");
      }
      currentData = ln.data;
      ln = ln.next;
      return currentData;
   }
   
      
}
