import java.util.Arrays;

public class arthProgression {
    public static void main(String[] args) {

    }

    public static int solve(int[] A){
        Arrays.sort(A);
        if(A.length>1){
            int diff = Math.abs(A[0]-A[1]);
            for(int i =0; i<A.length-1; i++){
                if(Math.abs(A[i]-A[i+1])!=diff){
                    return 0;
                }
            }
        }
        return 1;
    }
}
