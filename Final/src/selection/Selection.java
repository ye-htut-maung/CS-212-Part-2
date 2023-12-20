package selection;

public class Selection {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      short[] arr = {2,5,3,1,4};
      
      
      for (int i = 0; i < arr.length - 1; i++) {
         int lowestIndex = i;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[lowestIndex]) {
               lowestIndex = j;
            }
         }
         
//            swap(arr, lowestIndex, i);
         swap(arr[lowestIndex], arr[i]);
         
      }
      for (short i: arr) {
         System.out.println(i);
      }

   }
   
   public static void swap(short x, short y) {
      short temp = x;
      x = y;
      y = temp;
   }
   
//   public static void swap(short[] arr, int x, int y) {
//      short temp = arr[x];
//      arr[x] = arr[y];
//      arr[y] = temp;
//   }

}
