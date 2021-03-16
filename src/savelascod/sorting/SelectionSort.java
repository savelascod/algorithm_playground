package savelascod.sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class SelectionSort {

    /**
     * selection sort is an algorithm with a time complexity of O(n^2)
     *
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int minIndex = index;
            for (int auxIndex = index; auxIndex < array.length; auxIndex++) {
                if(array[auxIndex]<array[minIndex]) minIndex=auxIndex;
            }
            int temp = array[minIndex];
            array[minIndex] = array [index];
            array[index] = temp;
        }
        return array;
    }

    public static void main(String[] args){
        int[] sortedArray = SelectionSort.sort(new int[]{3,6,9,4,7,1,54});
        System.out.println(Arrays.stream(sortedArray).boxed().collect(Collectors.toList()));
    }
}
