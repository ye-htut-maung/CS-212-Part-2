package linkedListTest;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         LinkedList list = new LinkedList();
         list.append("a");
         list.append("abab");
         list.printList();
         
         LinkedListIterator ln = list.reset();
         while (ln.hasNode()) {
            System.out.println(ln.next());
         }
        
   }

}
