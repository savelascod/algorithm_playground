package savelascod.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlippingArrayVM {

    public static int flip(int a[])	{
        List<Integer> array = Arrays.stream(a).boxed().collect(Collectors.toList());
        int maxZeroAccount = 0;
        int leftIndex = 0;
        int rightIndex = 0;


        for (int index = 0; index < array.size(); index++) {
            for (int indexTwo = index+1; indexTwo < array.size(); indexTwo++) {
                List<Integer> subArray = array.subList(index,indexTwo);
                int sumZeros = (int) subArray.stream().filter(integer -> integer==0).count();
                int sumOnes = (int) subArray.stream().filter(integer -> integer==1).count();
                int difference = sumZeros-sumOnes;
                if(difference>maxZeroAccount) {
                    maxZeroAccount = sumZeros;
                    leftIndex = index;
                    rightIndex = indexTwo;
                }
            }
        }
        int sum = (int) array.subList(0, leftIndex).stream().filter(integer -> integer == 1).count() +
                (int) array.subList(rightIndex, array.size()).stream().filter(integer -> integer == 1).count();
        return (maxZeroAccount + sum);
    }

    public static void main(String[] args) {
        System.out.println(flip(new int[]{1,0,0,1,0,0,1,0}));
    }
}
