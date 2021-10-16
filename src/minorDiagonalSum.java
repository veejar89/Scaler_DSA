public class minorDiagonalSum {
    public static void main(String[] args) {
    int[][] A = {{1, -2, -3},{-4, 5, -6},{-7, -8, 9}};
    int[][] B = {{3, 2},{2, 3}};
        solve2(B);
    }
    public static int solve(final int[][] A) {
        int sum=0;
        for(int i=0; i<A.length; i++){
            for(int j=A[0].length-1; j>=0;j--){
                if(i+j==A.length-1){
                    sum = sum+ A[i][j];
                }
            }
        }
        return sum;
    }
    public static int solve2(final int[][] A) {
        int sum=0;
        for(int i=0; i<A.length; i++){
            int j = A.length-i-1;
            sum = sum+A[i][j];
        }
        return sum;
    }
}
