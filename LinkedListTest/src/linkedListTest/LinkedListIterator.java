package linkedListTest;

public class LinkedListIterator {
   
   ListNode node;
   
   public LinkedListIterator (ListNode first) {
       node = first;
   }
   
   public boolean hasNode() {
      return (node != null);
   }
   
   public String next() {
      if (node == null) {
         throw new NullPointerException("Linked list is empty");
      }
      String currentData = node.data;
      node = node.next;
      return currentData;
   }
   
   
}
