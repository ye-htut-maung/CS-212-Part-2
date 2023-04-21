package exceptionTest;

import java.util.regex.*;

public class RegularExpression {
   public static void main (String[] args) {
      String[] phoneNums = {"718-997-5000","7189975000",                      
                            "718.997.5000", "718-997.5000"};
      Pattern p;
      Matcher m;
      String Telephone_Pattern =
                          "(\\d{3})([\\.-]?)\\d{3}\\2\\d{4}";
      p = Pattern.compile(Telephone_Pattern);
        for (int i=0; i<phoneNums.length; i++) {
           m = p.matcher(phoneNums[i]);
           if (m.matches())
                System.out.println(phoneNums[i]+" Matches.");
           else
                System.out.println(phoneNums[i]+
                                   " does not match.");
       }
    }

}
