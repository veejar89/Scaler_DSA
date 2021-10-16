import java.util.Arrays;

public class arithmeticProgression {
    public static void main(String[] args) {
        int[] A = {2, 5, 1};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int diff = Math.abs(A[1]-A[0]);
        for(int i=2; i<A.length; i++){
            if(Math.abs(A[i]-A[i-1])!=diff){
                return 0;
            }
        }
        return 1;
    }
}
