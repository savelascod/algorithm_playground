package savelascod;

import savelascod.search.BinarySearch;
import savelascod.search.JumpSearch;
import savelascod.search.LinearSearch;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 2, 3, 3};
        //linear search
        System.out.println(LinearSearch.linearSearch(array, 6));
        //binary search
        System.out.println(BinarySearch.recursiveBinarySearch(array,0, array.length-1, 2));
        System.out.println(BinarySearch.iterativeBinarySearch(array,0, array.length-1, 2));
        //jump search
        System.out.println(JumpSearch.jumpSearch(array, 6));


        ///sorting

    }


}
