import java.util.Arrays;
import java.util.Scanner;

public class minimumPicks {
    public static void main(String[] args) {
        int[] array = {-10,-9,1,2,3,4,5,5,10,-90,-7};
        System.out.println(solve(array));
    }

    private static String getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    private static int solve(int[] A){
        int maxEven = 0;
        int minOdd = 0;

        Arrays.sort(A);
        for (int currIndex=A.length-1; currIndex>=0; currIndex--){
            if(A[currIndex]%2==0){
                maxEven=A[currIndex];
                break;
            }
        }
        for (int currIndex=0; currIndex<A.length; currIndex++){
            if(A[currIndex]%2!=0){
                minOdd = A[currIndex];
                break;
            }
        }
        return maxEven-minOdd;
    }
}
