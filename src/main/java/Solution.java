import java.util.HashSet;
import java.util.Set;

public class Solution {
    //Time complexity O(n)
    //Selected statics methods because it`s simpler use (Without creating solution object).
    public static int findMissingNumber(int[] numbers) {
        if (numbers == null || numbers.length == 1) {
            return -1;
        }

        quickSort(numbers); //Sort array
        int length = numbers.length;
        Set<Integer> set = new HashSet<>(); //Collection for temporal elements. Access to elements - O(1)

        //Put every element to set
        for (Integer number : numbers) {
            set.add(number);
        }

        //In loop check element availability
        for (int i = numbers[0]; i <= numbers[0] + length; i++) {
            if (!set.contains(i)) { //If set does not contain element, return its
                return i;
            }
        }
        return -1; //If every element in correct order, return -1
    }

    //Quick sort algorithm. Time complexity O(n*log(n))
    public static void quickSort(int[] array) {
        quickSortInternal(array, 0, array.length - 1);
    }

    //Internal quick sort logic
    private static void quickSortInternal(int[] array, int from, int to) {
        //Basic recursion case. Array contains only one element is basic case.
        if (array.length < 2) {
            return;
        }

        //If sorting was finished
        if (from >= to) {
            return;
        }

        int separator = partition(array, from, to);
        quickSortInternal(array, from, separator - 1); //Recursion invocation for left part
        quickSortInternal(array, separator, to); //Recursion invocation for right part
    }

    private static int partition(int[] arr, int from, int to) {
        int mid = (to + from) / 2; //Index of middle array`s element
        int pivot = arr[mid]; //
        int left = from; //Left array index
        int right = to; //Right array index

        //While there are elements for sorting
        while (left <= right) {

            //If element less than pivot - miss its
            while (arr[left] < pivot) {
                left++;
            }

            //If element more than pivot - miss its
            while (arr[right] > pivot) {
                right--;
            }

            //Swap elements
            if (left <= right) {
                int swap = arr[right]; //Temporal variable
                arr[right] = arr[left];
                arr[left] = swap;
                left++;
                right--;
            }
        }
        return left;
    }
}
