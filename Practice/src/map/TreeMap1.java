package map;
import java.util.*;

public class TreeMap1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      TreeMap<Integer, String> tm = new TreeMap<>();
      tm.put(1, "one");
      tm.put(2, "two");
      tm.put(3, "three");
      Map.Entry<Integer, String> me;
      
      Iterator itr = tm.entrySet().iterator();
      
      while(itr.hasNext()) {
         me = (Map.Entry)itr.next();
         System.out.println(me.getValue());
      }
      
      
   }

}
