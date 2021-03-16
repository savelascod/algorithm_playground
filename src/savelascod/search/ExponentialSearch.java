package savelascod.search;

public class ExponentialSearch {
    /**
     * exponential sort algorithm work over O(Log n).
     * @param array
     * @param element
     * @return
     */
    public static int exponentialSearch(int[] array, int element) {
        if (array[0] == element) return 0;
        int index = 1;
        while (array[index] <= element && index < array.length) {
            index *= 2;
        }
        return BinarySearch.recursiveBinarySearch(array, index / 2, Math.min(index, array.length), element);
    }
}
