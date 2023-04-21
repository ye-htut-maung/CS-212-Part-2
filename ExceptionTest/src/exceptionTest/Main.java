package exceptionTest;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
      String num;
      int n;
      while (true) {
         try {
            num = JOptionPane.showInputDialog(null, "Enter a number");
            n = Integer.parseInt(num);
            JOptionPane.showMessageDialog(null, "Thanks");
            if (n==0) System.exit(0);
         }
         catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,e);
         }
         
         
      }
      
   }

}
