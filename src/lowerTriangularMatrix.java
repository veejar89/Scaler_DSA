public class lowerTriangularMatrix {
    public static void main(String[] args) {
        //int[][] array = {{1, 0, 0},{0, 0, 1}, {-7, -8, 9}};
        int[][] array = {{0,2}, {0,0}};
        System.out.println(solve(array));
    }
    public static int solve(final int[][] A) {
        for(int i =0; i <A.length; i++){
            for(int j =i+1; j<A.length; j++){
                if(A[i][j]!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
}
