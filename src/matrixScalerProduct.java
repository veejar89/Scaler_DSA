public class matrixScalerProduct {
    public static void main(String[] args) {
    int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        solve(A, 2);
    }
    public static int[][] solve(int[][] A, int B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j]=A[i][j]*B;
            }
        }
        return A;
    }
}
