package savelascod.problems;

public class NumberOfPaths {

    public static long numberOfPaths(int m, int n) {
        return waysFromCurrentPos(0,0,m,n);
    }

    public static long waysFromCurrentPos(int rowIndex, int colIndex, int m, int n) {
        if(rowIndex==m-1 && colIndex==n-1) return 1;
        if(rowIndex>=m || colIndex>=n) return 0;
        return waysFromCurrentPos(rowIndex, colIndex+1, m, n) +
                waysFromCurrentPos(rowIndex+1, colIndex, m, n);
    }

    public static void main(String[] args) {
        System.out.println(numberOfPaths(3,3));
    }
}
