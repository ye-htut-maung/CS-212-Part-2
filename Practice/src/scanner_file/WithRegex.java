package scanner_file;

import java.util.Scanner;
import java.util.regex.*;

public class WithRegex {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String matchMe = "Hello;Goodbye;Testing123";

      Scanner scan = new Scanner(matchMe);
      scan.useDelimiter(";");

      Pattern pattern = Pattern.compile("[\\w]*");

      while (scan.hasNext()) {
         if (scan.hasNext(pattern)) {
            System.out.println(scan.next());
         } else {
            scan.next();
         }
      }
   }

}
