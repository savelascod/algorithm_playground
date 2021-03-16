package savelascod.search;

public class BinarySearch {

    /**
     * Binary search algorithm works over O(log n), given a sorted arrray
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @param element
     * @return
     */
    public static int recursiveBinarySearch(int[] array, int leftIndex, int rightIndex, int element) {
        if(rightIndex >= leftIndex){
            int pivot = leftIndex + (rightIndex-leftIndex)/2;
            if (array[pivot]==element) {
                return pivot;
            }
            if (array[pivot]>element) {
                return recursiveBinarySearch(array, leftIndex, pivot-1, element);
            }
            if(array[pivot]<element){
                return recursiveBinarySearch(array, pivot+1, rightIndex, element);
            }
        }
        return -1;
    }

    /**
     * Binary search algorithm works over O(1), given a sorted array
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @param element
     * @return
     */
    public static int iterativeBinarySearch(int[] array, int leftIndex, int rightIndex, int element) {
        while(rightIndex >= leftIndex){
            int pivot = leftIndex + (rightIndex-leftIndex)/2;
            if (array[pivot]==element) {
                return pivot;
            }
            if (array[pivot]>element) {
                rightIndex = pivot - 1;
            }
            if(array[pivot]<element){
                leftIndex = pivot + 1;
            }
        }
        return -1;
    }
}
