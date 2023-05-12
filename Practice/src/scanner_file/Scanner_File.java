package scanner_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_File {
   public static void main(String[] args) {
      Scanner scanFile = null;
      
      try {
         scanFile = new Scanner(new File("input1.txt"));
      } catch(IOException e) {
         e.printStackTrace();
      }
      
      while (scanFile.hasNextLine()) {
         System.out.println(scanFile.nextLine());
      }
   }
}
