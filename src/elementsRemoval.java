import java.util.Arrays;

public class elementsRemoval {
    public static void main(String[] args) {

        int[] A ={3,5,1,-3};
        solve(A);
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        long ans =0;
        int N = A.length-1;
        for(long i=N; i>=0; i--){
            ans = ans+A[(int) i] * (N-i+1);
        }
        return (int) ans;
    }
}
