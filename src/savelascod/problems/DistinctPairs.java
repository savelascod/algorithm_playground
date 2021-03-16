package savelascod.problems;

import com.sun.tools.javac.util.Pair;

import java.util.HashSet;

public class DistinctPairs {


    public static int countPairsWithDiffK(int arr[], int n, int k){
        HashSet uniquePairs = new HashSet();
        for (int index = 0; index < arr.length; index++) {
            for(int indexTwo = index + 1; indexTwo<arr.length; indexTwo++){
                if(Math.abs(arr[index]-arr[indexTwo])==k) uniquePairs.add(new Pair<>(index, indexTwo));
            }
        }
        return uniquePairs.size();
    }

    public static void main(String[] args) {
        System.out.print(countPairsWithDiffK(new int[]{1,5,3,4,2}, 5, 3));
    }
}
