package savelascod.problems;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        ArrayList<Integer> response = subarraySum(new int[]{8}, 1, 8);
        System.out.println(response);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> response = new ArrayList<>();
        int sum = 0;
        if(n==1){
            if (arr[0]==s) {
                response.add(1);
                response.add(1);
            } else {
                response.add(-1);
            }
            return response;
        }
        int leftIndex = 0;
        int rightIndex = 1;
        sum += arr[leftIndex] + arr[rightIndex];
        while (sum != s && rightIndex < n) {
            if(sum < s){
                rightIndex+=1;
                if(rightIndex<n) {
                    sum += arr[rightIndex];
                }
            }
            if (sum > s) {
                sum -= arr[leftIndex++];
            }
        }
        if(sum!=s){
            response.add(-1);
            return response;
        }
        response.add(leftIndex+1);
        response.add(rightIndex+1);
        return response;
    }
}
