import java.util.Arrays;

public class minAbsDiff {
    public static void main(String[] args) {
        int[] A ={1, 8, 10, 12, 13};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=1; i<A.length; i++){
            if(minDiff>Math.abs(A[i]-A[i-1])){
                minDiff =Math.abs(A[i]-A[i-1]);
            }
        }
        return minDiff;
    }
}
