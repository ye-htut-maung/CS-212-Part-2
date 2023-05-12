package lab24;
// MoneyList.java

// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

   /** First node in linked list - dummy node */
   private MoneyNode first = new MoneyNode(null);

   /** Last node in linked list */
   private MoneyNode last = first;

   /** Number of data items in the list. */
   private int length = 0;

   /**
    * Gets the number of data values currently stored in this MoneyList.
    *
    * @return the number of elements in the list.
    */

   public int getLength() {
      return length;
   }

   /**
    * Appends a String data element to this MoneyList.
    *
    * @param data the data element to be appended.
    */
   public void append(Money d) {

      // write the code here for append
      MoneyNode toAppend = new MoneyNode(d);
      last.next = toAppend;
      last = toAppend;
      length++;
   } // method append(String)

   /**
    * Prepends (adds to the beginning) a String data element to this MoneyList.
    *
    * @param data the data element to be prepended.
    */
   public void prepend(Money d) {
      MoneyNode toPrepend = new MoneyNode(d);
      if (first == last) {
         last.next = toPrepend;
         last = toPrepend;
         length++;
      } else {
         toPrepend.next = first.next;
         first.next = toPrepend;
         length++;
      }
      // write the code here for prepend

   } // method append(String)

   /**
    * Prints the contents of the Linked List
    *
    */
   public String toString() {
      MoneyNode p = first.next;
      String returnString = "";
      while (p != null) {
         returnString += p.data + " ";
         p = p.next;
      }
      return returnString;
   }

   public MoneyNode getHead() {
      return first;
   }

   public void printFirstToLast(MoneyNode n) {
      if (n == null) {
         return;
      }
      System.out.println(n.data + " ");
      printFirstToLast(n.next);
   }

   public void printReverse(MoneyNode n) {
      if (n == null) {
         return;
      }
      printReverse(n.next);
      System.out.println(n.data + " ");
   }

   /**
    * return the total amount in the list
    */

   public float sumWallet() {
      MoneyNode pointer = first.next;
      float total = 0;
      while (pointer != null) {
         if (pointer.data instanceof Coin) {
            total += pointer.data.getValue() / 100.0;
         } else {
            total += pointer.data.getValue();
         }
         pointer = pointer.next;

      }
      return total;
   }

   public float sumWalletRecur(MoneyNode n, float total) {

      if (n == null) {

         return 0.0f;
      }
      if (n.data instanceof Coin) {
         return total + (n.data.getValue() / 100.0f) + sumWalletRecur(n.next, total);
      }

      return total + n.data.getValue() + sumWalletRecur(n.next, total);
   }

   public float sumQuarter(MoneyNode n, float total) {
      if (n == null) {

         return 0.0f;
      }
      if (n.data instanceof Quarter) {
         return total + (n.data.getValue() / 100.0f) + sumQuarter(n.next, total);
      }
      return sumQuarter(n.next,total);
   }

   /**
    * Determines whether this ShortSequenceLinkedList is equal in value to the
    * parameter object. They are equal if the parameter is of class
    * ShortSequenceLinkedList and the two objects contain the same short integer
    * values at each index.
    *
    * @param other the object to be compared to this ShortSequenceLinkedList
    *
    * @return <code>true</code> if the parameter object is a
    *         ShortSequenceLinkedList containing the same numbers at each index as
    *         this ShortSequenceLinkedList, <code>false</code> otherwise.
    */
   public boolean equals(Object other) {
      if (other == null || getClass() != other.getClass() || length != ((MoneyList) other).length)
         return false;

      MoneyNode nodeThis = first;
      MoneyNode nodeOther = ((MoneyList) other).first;
      while (nodeThis != null) {
         // Since the two linked lists are the same length,
         // they should reach null on the same iteration.

         if (nodeThis.data != nodeOther.data)
            return false;

         nodeThis = nodeThis.next;
         nodeOther = nodeOther.next;
      } // while

      return true;
   } // method equals

} // class MoneyList
