package savelascod.search;

public class LinearSearch {

    /**
     * Linear search algorithm works on O(n)
     * @param array
     * @param element
     * @return
     */
    public static int linearSearch(int[] array, int element){
        for (int index = 0; index < array.length; index++) {
            if (array[index]==element) return index;
        }
        return -1;
    }
}
