package Activities;
import java.util.Arrays;

public class Activity4 {

   static void ascendingSortArray(int array[]) {
       int size = array.length;
       int temp = 0;
       /* sort the array*/

       for (int i = 0; i < size; i++) {
           for (int j = i + 1; j < size; j++) {
               if (array[i] > array[j]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
       }
   }

    public static void main(String[] args)
        {
            int[] unsortArray = {3, 8, 2, 4, 7, 5};
            System.out.println("Unsorted Array: " + Arrays.toString(unsortArray));
            ascendingSortArray(unsortArray);
            System.out.println("Sorted Array: " +Arrays.toString(unsortArray));
        }
}
