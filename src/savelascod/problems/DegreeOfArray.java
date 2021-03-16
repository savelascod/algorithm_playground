package savelascod.problems;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;

public class DegreeOfArray {
    public static  int findShortestSubArray(int[] nums) {
        ArrayList<Integer> array = (ArrayList<Integer>)
                Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashMap<Integer, List<Integer>> subArraysSameDegree = new HashMap<>();

        int arrayDegree = findArrayDegree(nums);

        for (int leftIdx = 0; leftIdx < array.size(); leftIdx++) {
            for (int rightIdx = leftIdx+1; rightIdx < array.size(); rightIdx++) {
                List<Integer> subArray = array.subList(leftIdx, rightIdx+1);
                if (findArrayDegree(subArray.stream().mapToInt(Integer::intValue).toArray()) == arrayDegree)
                    subArraysSameDegree.put(subArray.size(), subArray);
            }
        }
        return subArraysSameDegree.keySet().stream().mapToInt(Integer::intValue).min().orElse(1);
    }


    public static int findArrayDegree(int [] array){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            if(!hashMap.containsKey(array[index])){
                hashMap.put(array[index], 1);
            } else {
                hashMap.compute(array[index], (key, value) -> value+=1);
            }
        }
        return hashMap.values().stream().max(Comparator.naturalOrder()).get();
    }

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{0}));
    }
}
