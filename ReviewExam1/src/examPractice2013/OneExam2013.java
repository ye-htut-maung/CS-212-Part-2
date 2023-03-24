package examPractice2013;
import javax.swing.*;

public class OneExam2013 {
   public static void main(String[] args) {
      String sentence;
      int counter = 0;
      
      sentence = JOptionPane.showInputDialog(null, "Enter a sentence: ");
      String[] words = sentence.split(" ");
      
      for (int i = 0; i < words.length; i++) {
         if (Character.isDigit(words[i].charAt(0))) {
            int number;
            number = Integer.parseInt(words[i]);
            while (number > 10) {
               counter++;
               number = number / 10;
               
            }
         }
      }
      JOptionPane.showMessageDialog(null, "Two Digits happen " + counter + " time/s");
   }

}
