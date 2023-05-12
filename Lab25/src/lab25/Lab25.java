package lab25;
public class Lab25 {
   
   

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
        int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };

        System.out.println(largest(intArray,intArray[0], 0));
        System.out.println(sum(intArray, 0));
        System.out.println(isSorted(intArray, 0));
        System.out.println(isSorted(intArray, 8));
        System.out.println(isSorted(intArray1, 0));
    }

    public static int largest(int[] myArray, int largest, int index) {
        // TODO Fill me in
       if (myArray.length  == index) {
          return largest;
       } 
       if (myArray[index] > largest) {
          largest = myArray[index];
       }
       return largest(myArray,largest, index+1);
    
    }

    public static int sum(int[] myArray, int index) {
        // TODO Fill me in
       if (myArray.length == index) {
          return 0;
       } 
       return myArray[index] + sum(myArray, index + 1);
        
    }

    public static boolean isSorted(int[] myArray, int index) {
        // TODO Fill me in
       if (myArray.length - 2 == index) {
          return true;
       }
       if (myArray[index+1] < myArray[index]) {
          return false;
       }
       
       return isSorted(myArray, index + 1);
       
    }

}