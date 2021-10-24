import java.util.Arrays;

public class littlePonny {
    public static void main(String[] args) {
    int[] A = {1, 4, 2, 4, 5, 6, 0, 3};
    System.out.println(solve(A, 3));
    }
    public static int solve(int[] A, int B) {
        int counter =0;
        Arrays.sort(A);
        for(int i=A.length-1; i>=0; i--){
            if(A[i]!=B){
                counter++;
            } else {
                return counter;
            }
        }
        return -1;
    }
}
