package savelascod.search;

public class JumpSearch {

    /**
     * Jump search algorithm works over O(sqrt(n)), given a sorted array
     * @param array
     * @param element
     * @return
     */
    public static int jumpSearch(int[] array, int element) {
        int jumpSize = (int)Math.floor(Math.sqrt(array.length));
        int prevStep = 1;
        int step = jumpSize;
        while (array[Math.min(step, array.length)-1] < element) {
            prevStep = step;
            step += jumpSize;
            if(prevStep>=array.length){
                return -1;
            }
        }
        for (int index = prevStep-1; index < step; index++) {
            if(array[index]==element) return index;
        }
        return -1;
    }
}
