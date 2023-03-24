package assertion;

public class AssertionTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int age = 10;
      System.out.println(args.length);
      
      if (age <= 18) {
         throw new IllegalArgumentException("Illegal age");
      }
     
      System.out.println(age+ "::");
   }

}
