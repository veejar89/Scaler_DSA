import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class countDuplicates {
    public static void main(String[] args) {
       int[] A = {-1, 2, -1};
        System.out.println(solve(A));
    }
    public static int solve(final int[] A) {
        int count =0;
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0; i <A.length;i++){
            if(out.contains(A[i]+"")){
                count = count+1;
            } else {
                out.add(A[i]+"");
            }
        }
        return count;
    }
}
