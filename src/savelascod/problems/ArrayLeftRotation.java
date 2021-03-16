package savelascod.problems;

public class ArrayLeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int pos = 1; pos <= a.length; pos++) {
            int newPos = (pos-d);
            if(newPos <=0) newPos+=a.length;
            rotated[newPos-1] = a[pos-1];
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[] array = rotLeft(new int[]{1,2,3,4,5},4);
        System.out.println(array);
    }
}
