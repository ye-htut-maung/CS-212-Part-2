package linkedList;

public class Main {
   public static void main(String[] args) {
      
      LinkedList list = new LinkedList();
      list.append("one");
      list.append("two");
      list.prepend("zero");
      list.printAll();
   }
}
