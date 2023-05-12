package map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class MapTest {
   public static void main(String args[]) {
      // An English-French dictionary. Maps English words to French words.
      Map<String, String> french = new TreeMap<>();
      /*
       * Tip: Since TreeMap is a subclass of Map, we can assign a TreeMap<X,Y> to a
       * Map<X,Y>. If we later decide that we wanted a HashMap instead, we could
       * change just this line and all the map operations will still work
       */

      // Stick a few items in there first
      french.put("cat", "chat");
      french.put("water", "eau");
      french.put("moon", "lune");

      // Now let's translate "cat"
      String myData = french.get("cat");
      // get() asks the dictionary for the value associated with "cat"
      System.out.println(myData);

      // Print the map iteratively
      Set set = french.entrySet();
      Iterator i = set.iterator();
      while (i.hasNext()) {
         Map.Entry me = (Map.Entry) i.next(); // Grab a key-value pair from the map
         System.out.print(me.getKey() + ": ");// Print the key
         System.out.println(me.getValue()); // Then print the value
      }
   }
}
