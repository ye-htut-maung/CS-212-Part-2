package project2;

import javax.swing.*;
import java.awt.*;

/**
 * The GUI of Roman numeral to Arabic numeral
 * 
 * @author Ye Htut Maung
 *
 */

public class RomanNumeralGUI extends JFrame {
   
   static Container myContentPane;
   static TextArea myOriginalRoman;
   static TextArea unsortedNumbers;
   static TextArea sortedNumbers;

   /**
    * Constructor - Creating a User Interface
    */

   public RomanNumeralGUI(UnsortedRomanNumeralList unsortedList, SortedRomanNumeralList sortedList) {
      setSize(600, 400);
      setLocation(100, 100);
      setTitle("Roman Numeral");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
      setLayout(new GridLayout(1, 3));
      myContentPane = getContentPane();
      myOriginalRoman = new TextArea();
      unsortedNumbers = new TextArea();
      sortedNumbers = new TextArea();
      myOriginalRoman.setEditable(false);
      unsortedNumbers.setEditable(false);
      sortedNumbers.setEditable(false);
      myContentPane.add(myOriginalRoman);
      myContentPane.add(unsortedNumbers);
      myContentPane.add(sortedNumbers);
      
      printRomanANumeral(unsortedList, sortedList);
   }

   /**
    * Print three columns: one column with individual unsorted Roman numeral, one
    * column with corresponding unsorted Arabic numbers and one column with sorted
    * numbers
    * 
    * @param unsortedList
    * @param sortedList
    */

   public static void printRomanANumeral(UnsortedRomanNumeralList unsortedList, SortedRomanNumeralList sortedList) {
      
      
      // pointer node of unsorted list
      RomanNumeralListNode p = unsortedList.first.next;
      
      // adding unsorted roman numeral and arabic numbers to GUI
      while (p != null) {
         myOriginalRoman.append(p.data.getRomanNumeral() + "\n");
         unsortedNumbers.append(p.data.getArabicValue() + "\n");
         p = p.next;
      }
      
      // pointer node of sorted list
      RomanNumeralListNode p2 = sortedList.first.next;
      
      // adding sorted arabic numbers to GUI
      while (p2 != null) {
         sortedNumbers.append(p2.data.getArabicValue() + "\n");
         p2 = p2.next;
      }

   }
}
