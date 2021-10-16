public class rowWithMax1 {
    public static void main(String[] args) {
        int[][]A = {{0, 0, 0, 0},{0, 1, 1, 1}};
        solve(A);
    }
    public static int solve(int[][] A) {
        int out=0;
        int row=0;
        int col = A[0].length-1;
        while(row<A.length && col>=0 ){
            if(A[row][col]==1){
                out = row;
                col--;
            } else {
                row++;
            }
        }
        return out;
    }
}
