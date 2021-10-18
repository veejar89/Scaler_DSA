public class copyTheArray {
    public static void main(String[] args) {
        int[] A = {1,1,10};
        int B = 6;
        solve(A,B);
    }
    public static int[] solve(final int[] A, int B) {
        int[] out = new int[A.length];
        for(int i =0; i<A.length; i++){
            out[i]= A[i]+B;
        }
        return out;
    }
}
