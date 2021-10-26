import java.util.Arrays;

public class maxMin {
    public static void main(String[] args) {
        int[] A = {3, 100, 43, 36, 92, 20, 74, 95, 4, 74, 13, 39, 8, 16, 13, 43, 16, 90, 97, 66, 56, 51, 47, 95, 72, 93, 46};
        int B = 6;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int counterMin =0;
        int counterMax =0;
        int min = A[0];
        int max = A[A.length-1];
        if(B>1){
            for(int i=1; i<A.length; i++){
                if(counterMin==B-1) {
                    break;
                }
                    if(min<A[i]){
                        min= A[i];
                    }
                counterMin = counterMin+1;
            }
            for(int i=A.length-2; i>=0;i--){
                if(counterMax==B-1) {
                    break;
                }
                if(max>A[i]){
                    max= A[i];
                }
                counterMax = counterMax+1;
            }
        }
        return max-min;
    }
}
