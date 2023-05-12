package scanner_file;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChooser {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.showOpenDialog(null);
      File file = fileChooser.getSelectedFile();
      System.out.println(file.lastModified());
   }

}
