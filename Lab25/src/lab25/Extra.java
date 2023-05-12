package lab25;

public class Extra {
   static int largest;

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] intArray = {3,5,9,4,10,33,12,19,4,16,23,30};
      System.out.println(largest(intArray, 0));
   }
   public static int largest(int[] myArray, int index) {
      
      if (myArray.length + 1 == index) {
         return largest;
      } 
      if (myArray[index] > largest) {
         largest = myArray[index];
      }
      
      return largest(myArray, index+1);
      
      
   }

}
