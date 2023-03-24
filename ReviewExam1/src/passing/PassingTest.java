package passing;

public class PassingTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
        int[] s1 = {1,2,3,4};
        String s2 = "Cat";
        
        System.out.println(s1[0]);
        System.out.println(s2);
        
        doSomething(s1, s2);
        
        System.out.println(s1[0]);
        System.out.println(s2);
        
   }
   
   public static void doSomething(int[] x, String y) {
      x[0] = 10;
      y = "Bread";
   }

}
