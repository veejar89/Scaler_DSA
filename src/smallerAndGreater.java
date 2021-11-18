import java.util.Arrays;
import java.util.Scanner;

public class smallerAndGreater {
    public static void main(String[] args) {
       int[] array = {0,1,2,3,0,4};
       System.out.println(solve(array));
    }

    private static String getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int out=0;
        int arrLen = A.length;
        int minValue = A[0];
        int maxValue = A[arrLen-1];
        for(int currIndex=1; currIndex <arrLen; currIndex++) {
            if ((A[currIndex] > minValue) && (A[currIndex] < maxValue)) {
                System.out.println(A[currIndex]);
                out += 1;
            }
        }
        return out;
    }
}
