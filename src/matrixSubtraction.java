public class matrixSubtraction {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int[][] A1 = {{1, 1}};
        int[][] B1 ={{2,3}};
        solve(A1, B1);
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int[][] c = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j =0; j<A[0].length; j++){
                c[i][j]= A[i][j]-B[i][j];
            }
        }
        return c;
    }
}
