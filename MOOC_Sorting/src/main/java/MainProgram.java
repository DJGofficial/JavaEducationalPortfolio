
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {6, 3, 0, -1, 4};
       System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }

    public static int smallest(int[] array) {
    
        int number = array[0];
        for (int i : array) {
            if (i < number) {
                number = i;
                i++;
               
            }
        }
        return number;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int number = array[index];
        for (int i : array) {
            if (i < number) {
                number = i;
                i++;
                index++;
            }

        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int minIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = index1;
        int toSwap = index2;
        int first = array[toSwap];
        int second = array[swap];
        for (int i : array) {
            if (i == first) {
                array[toSwap] = second;
            }
            if (i == second) {

                array[swap] = first;
            }
        }
    }

    public static void sort(int[] array) {
        int index = 0;
        int count = 0;
        //int swap = array[indexOfSmallestFrom(array, index)];
     
        for (int i : array) {
             
            if (i >= array[indexOfSmallestFrom(array, index)]) {
          swap(array,indexOfSmallestFrom(array, index),count);
                //array[0] = swap;
           count++;
            index++;
    
           

            // swap=indexOfSmallestFrom(array, 0);
        }
   
   
        System.out.println(Arrays.toString(array));

    }
}
}
