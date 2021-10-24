import java.util.ArrayList;

public class leadersInArray {
    public static void main(String[] args) {
        int[] A = {1, 2};
        solve(A);
    }
    public static int[] solve(int[] A) {
        ArrayList<Integer> out = new ArrayList<>();
        for(int i =0; i<A.length; i++){
            for(int j =i+1; j<A.length; j++){
                if(A[i]<A[j]){
                    break;
                }
                if(j==A.length-1){
                    out.add(A[i]);
                }
            }
        }
        out.add(A[A.length-1]);
        int[] arrOut = new int[out.size()];
        for(int a=0; a<arrOut.length; a++){
            arrOut[a]=out.get(a);
        }
        return arrOut;
    }
}
