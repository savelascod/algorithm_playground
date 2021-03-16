package savelascod.problems;

import java.util.Arrays;

public class MinimumBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int[] auxq = new int[q.length];
        int[] bribesAccount = new int[q.length];
        int totalBribes = 0;
        boolean isChaos = false;
        for (int index = 0; index < auxq.length; index++) {
            auxq[index]=index+1;
        }
        for (int index = q.length-1; index >=0; index--) {
            if(q[index]!=auxq[index]){
                bribesAccount[auxq[index]-1]+=1;
                bribesAccount[auxq[index-1]-1]+=1;
                totalBribes+=1;
                if(bribesAccount[auxq[index-1]-1] > 2 || bribesAccount[auxq[index]-1] > 2){
                    System.out.println("Too chaotic");
                    isChaos=true;
                    break;
                }
                int temp = auxq[index];
                auxq[index]=auxq[index-1];
                auxq[index-1]=temp;
            }
        }
        if(!isChaos) System.out.println(totalBribes);
    }

    public static void main(String[] args) {
        minimumBribes(new int[]{2,1,5,3,4});
        minimumBribes(new int[]{4,1,2,3});
        minimumBribes(new int[]{4,1,2,3});
    }
}
