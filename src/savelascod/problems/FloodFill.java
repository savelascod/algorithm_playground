package savelascod.problems;

import java.util.Arrays;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        if(sr==0 && sc==0 && image.length!=0) {
            sr=+1;
            sc+=1;
        }
        return floodFillAux(image,sr,sc,newColor);
    }
    public static int[][] floodFillAux(int[][] image, int sr, int sc, int newColor){
        if(sr==0 || sc==0) return image;
        int originalColor = image[sr-1][sc-1];
        image[sr-1][sc-1] = newColor;
        if(originalColor==newColor) return image;

        int rowIndex = sr-1;
        int colIndex = sc-1;
        if(rowIndex-1>=0 && image[rowIndex-1][colIndex]==originalColor){
            image = floodFill(image, sr-1, sc, newColor);
        }
        if(rowIndex+1<image.length && image[rowIndex+1][colIndex]==originalColor){
            image = floodFill(image, sr+1, sc, newColor);
        }
        if(colIndex-1>=0 && image[rowIndex][colIndex-1]==originalColor){
            image = floodFill(image, sr, sc-1, newColor);
        }
        if(colIndex+1<image[rowIndex].length && image[rowIndex][colIndex+1]==originalColor){
            image = floodFill(image, sr, sc+1, newColor);
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{2,1,2,1,3},{2,3,3,3,2},{2,3,1,3,2},{1,2,3,2,2}};
        image = floodFill(image,1,1,1);
        for (int indexRow = 0; indexRow < image.length; indexRow++) {
            for (int indexCol = 0; indexCol < image[indexRow].length; indexCol++) {
                System.out.print(" ["+image[indexRow][indexCol]+"] ");
            }
            System.out.println();
        }
    }
}
