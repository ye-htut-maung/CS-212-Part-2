package lab21;

import java.io.File;

public class ListLargestFile {
   static protected long largestFileLength = 0;
   static File largestFile;
   public ListLargestFile (File f, String indent) {
      listFiles(f,indent);
   }
   public static void listFiles(File f, String indent) {
      
      File files[] = f.listFiles();
      
      for (int i = 0; i<files.length; i++) {
          File f2 = files[i];
          
          if (f2.length() > largestFileLength) {
             largestFileLength = f2.length();
             largestFile = f2;         
          }
          
//          System.out.print(indent+f2.getName());
//          System.out.print("...");
//          System.out.print(f2.lastModified());
//          System.out.print("...");
//          System.out.print(f2.length());
//          System.out.println();
          if (f2.isDirectory())
              listFiles(f2, indent+"   ");
      }
      System.out.print(indent+largestFile.getName());
      System.out.print("...");
      System.out.print(largestFile.lastModified());
      System.out.print("...");
      System.out.print(largestFile.length());
      System.out.println();
  }
}
