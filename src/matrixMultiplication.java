public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2},{3, 4}};
        int[][] B = {{5, 6},{7, 8}};
        int[][] A1 ={{1,1}};
        int[][] B1 = {{2},{3}};
        solve(A1, B1);
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[0].length; j++){
                for(int k=0; k<B.length; k++){
                    C[i][j] = C[i][j] + A[i][k] *B[k][j];
                }
            }
        }
        return C;
    }
}
