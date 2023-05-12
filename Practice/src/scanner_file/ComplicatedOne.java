package scanner_file;

import java.io.File;

import javax.swing.JFileChooser;

public class ComplicatedOne {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      JFileChooser fd = new JFileChooser();
   // mode - the type of files to be displayed:
   // * JFileChooser.FILES_ONLY
   // * JFileChooser.DIRECTORIES_ONLY
   // * JFileChooser.FILES_AND_DIRECTORIES 
   fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
   fd.showOpenDialog(null);
   File f = fd.getSelectedFile();
   listFiles(f,"");
   }
   public static void listFiles(File f, String indent) {
   File files[] = f.listFiles();
   for (int i = 0; i<files.length; i++) {
   File f2 = files[i];
   System.out.print(f2.getName());
   if (f2.isDirectory())
   listFiles(f2, indent+" ");
   System.out.print("...");
   System.out.print(f2.length());
   System.out.println();
   }

   }

}
