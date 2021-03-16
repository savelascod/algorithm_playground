package savelascod.problems;

public class MinimunSwap {

    static int minimumSwaps(int[] arr) {
        int total = 0;

        int idxMin = 0;
        while(idxMin<arr.length){
            //encontrar el mayor a la derecha
            int indexMinRight = idxMin;
            for(int idx = idxMin+1; idx < arr.length; idx++) {
                if(arr[idx]<arr[indexMinRight]) {
                    indexMinRight = idx;
                }
            }

            //encontrar el mayor a la izquierda del minRight
            if(indexMinRight!=idxMin){
                int indexMaxLeft = indexMinRight;
                for(int idx = indexMinRight -1; idx >= 0; idx--){
                    if(arr[idx]>arr[indexMaxLeft]){
                        indexMaxLeft = idx;
                    }
                }
                if(indexMaxLeft!=indexMinRight){
                    int temp = arr[indexMaxLeft];
                    arr[indexMaxLeft] = arr[indexMinRight];
                    arr[indexMinRight] = temp;
                    total++;
                }
            }
            //verificar si hay menores a la derecha
            boolean hasRightMin = false;
            for(int idx = idxMin+1; idx < arr.length; idx++) {
                if(arr[idx]<arr[indexMinRight]) {
                    hasRightMin = true;
                    break;
                }
            }
            if(!hasRightMin) idxMin++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{1,3,5,2,4,6,7}));
    }
}
