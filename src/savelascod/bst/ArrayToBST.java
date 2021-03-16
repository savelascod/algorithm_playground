package savelascod.bst;

import java.util.ArrayList;

public class ArrayToBST {

    public static int[] sortedArrayToBST(int[] nums){
        ArrayList preOrder = new ArrayList();
        Node root = arrayToBST(nums, 1, nums.length);
        Transversal.preOrderTransversal(root, preOrder);
        preOrder.stream().mapToInt(value -> Integer.valueOf((Integer) value)).toArray();
        return preOrder.stream().mapToInt(value -> Integer.valueOf((Integer) value)).toArray();
    }

    public static Node arrayToBST(int [] array, int leftPosition, int rightPosition){
        if(leftPosition==rightPosition) return new Node(array[leftPosition-1]);
        int midPoint = (int) Math.floor((rightPosition-leftPosition)/2) + leftPosition;
        Node root = new Node(array[midPoint-1]);
        if(midPoint>leftPosition)root.left = arrayToBST(array, leftPosition, midPoint-1);
        if(midPoint<rightPosition)root.right = arrayToBST(array, midPoint+1, rightPosition);
        return root;
    }

    public static void main(String[] args){
        int[] preOrder = sortedArrayToBST(new int[]{1,2,3,4,5,6,7});
        System.out.printf(preOrder.toString());
    }
}
