import java.util.Arrays;
import java.util.Scanner;

public class rotationGame {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int B =2;
        int[] rotate = solve(A,B);
        for(int i=0; i<rotate.length; i++){
            System.out.println(rotate[i]);
        }
    }

    public static int[] solve(int[] A, int B){
        int arrLen = A.length;
        int[] out = new int[arrLen];
        B= B%arrLen;
        for(int i =0; i<arrLen; i++){
            out[i]= A[(arrLen-B+i)%arrLen];
        }
        return out;
    }
}
