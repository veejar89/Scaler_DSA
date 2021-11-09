public class multiplyPrevAndNext {
    public static void main(String[] args) {
        int[] arr={0};
        solve(arr);
    }
    public static int[] solve(int[] A) {
        int[] out = new int[A.length];
        if(A.length>1) {
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    out[i] = A[i] * A[i + 1];
                } else if (i == A.length - 1) {
                    out[i] = A[i] * A[i - 1];
                } else {
                    out[i] = A[i - 1] * A[i + 1];
                }
            }
        }
        return out;
    }
}
