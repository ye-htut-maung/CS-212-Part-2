package guiTest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler implements ActionListener{
   JFrame jframe;
   public FileMenuHandler(JFrame jf) {
      jframe = jf;
   }
   
   public void actionPerformed(ActionEvent event) {
      String menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
         openFile();
      } else if (menuName.equals("Quit")) {
         System.exit(0);
      }
      
   } // actionPerformed
   
   private void openFile() {
      JFileChooser chooser;
      int status;
      chooser = new JFileChooser();
      status = chooser.showOpenDialog(null);
      if (status == JFileChooser.APPROVE_OPTION) {
         readSource(chooser.getSelectedFile());
      } else {
         JOptionPane.showMessageDialog(null, "Open File dialog canceled");
      }
      
   }// openFile
   
   private void readSource(File chosenFile) {
      String chosenFileName = chosenFile.getName();
      TextFileInput inFile = new TextFileInput(chosenFileName);
      String ssn;
      int subscript = 0;
      Container myContentPane = jframe.getContentPane();
      TextArea myTextArea = new TextArea();
      TextArea mySubscripts = new TextArea();
      myContentPane.add(myTextArea, BorderLayout.EAST);
      myContentPane.add(mySubscripts, BorderLayout.WEST);
      
      ssn = inFile.readLine();
      while (ssn != null) {
         mySubscripts.append(Integer.toString(subscript++) + "\n");
         myTextArea.append(ssn + "\n");
         ssn = inFile.readLine();
      }// while
      jframe.setVisible(true);
   } 
}
