package savelascod.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    /**
     * Time complexity for bubble sort is O(n^2), O(n) best case
     *
     * @param array
     * @return
     */
    public static int[] iterativeSort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int auxIndex = index + 1; auxIndex < array.length; auxIndex++) {
                if (array[auxIndex] < array[index]) {
                    int temp = array[index];
                    array[index] = array[auxIndex];
                    array[auxIndex] = temp;
                }
            }
        }
        return array;
    }

    public static void recursiveSort(int[] array, int indexStart) {
        for (int index = indexStart+1; index < array.length-1; index++) {
            recursiveSort(array,index);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = BubbleSort.iterativeSort(new int[]{55, 7, 12, 1, 45, 9});
        System.out.println(Arrays.stream(sortedArray).boxed().collect(Collectors.toList()));
    }
}
