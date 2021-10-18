import java.util.ArrayList;
import java.util.Arrays;

public class consecutiveElements {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 5, 6};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        for(int i =0; i<A.length-1; i++){
            if(A[i+1]-A[i]!=1){
                return 0;
            }
        }
        return 1;
    }
}
