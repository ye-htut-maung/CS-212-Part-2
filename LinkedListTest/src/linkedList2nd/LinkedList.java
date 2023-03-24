package linkedList2nd;

public class LinkedList {
   
   private ListNode first = new ListNode(null);
   private ListNode last = first;
   private int length = 0;
   
   public int getLength() {
      return length;
   }
   
   public void append (String d) {
      ListNode node = new ListNode(d);
      last.next = node;
      last = node;
      length++;
   }
   
   public String toString() {
      ListNode node = first.next;
      String returnString = "a";
      while (node != null) {
         returnString += node.data + " ";
         node = node.next;
      }
      return returnString;
   }
   
   

}
