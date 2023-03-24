package selectionSort;

public class SelectionSort {
   public static void main (String[] args) {
      TextFileInput in = new TextFileInput(args [0]);
      
      int[] numbers = new int[10];
      int lineIndex = 0;
      int subArrayLength = 0;
      int smallestIndex;
      
      String line = in.readLine();
      while (numbers.length > lineIndex && line != null) {
         numbers[lineIndex++] = Integer.parseInt(line);
         
         line = in.readLine();
         subArrayLength++;
      }
      
      
      
      
      
      for (int i = 0; i < subArrayLength - 1; ++i) {
         smallestIndex = i;
         for (int j = i + 1; j < subArrayLength; ++j) {
            if (numbers[j] < numbers[smallestIndex]) {
               smallestIndex = j;
            }
         }
         if (smallestIndex != i) {
            swap(numbers, smallestIndex, i);
         }
      }
      
      for(int n = 0; n < subArrayLength; n++) {
         System.out.println(numbers[n]);
      }
      
   }
   
   public static void swap (int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

}
