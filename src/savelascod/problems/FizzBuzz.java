package savelascod.problems;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        // Write your code her
        for (int i = 1; i <= n; i++) {
            if(Math.floorMod(i,3)==0 && Math.floorMod(i,5)==0) System.out.println("FizzBuzz");
            if(Math.floorMod(i,3)==0 && Math.floorMod(i,5)!=0) System.out.println("Fizz");
            if(Math.floorMod(i,3)!=0 && Math.floorMod(i,5)==0) System.out.println("Buzz");
            if(Math.floorMod(i,3)!=0 && Math.floorMod(i,5)!=0) System.out.println(i);
        }

    }


    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
