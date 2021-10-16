public class rotateMatrix {
    public static void main(String[] args) {
    int[][] A = {{1}};
        solve(A);
    }
    public static int[][] solve(int[][] A) {
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                A[i][j]=A[i][j]^A[j][i];
                A[j][i]=A[i][j]^A[j][i];
                A[i][j]=A[i][j]^A[j][i];
            }
        }
        for(int k=0; k<A.length; k++){
            int i=0;
            int j = A[0].length-1;
            while(i<j){
                A[k][i]=A[k][i]^A[k][j];
                A[k][j]=A[k][i]^A[k][j];
                A[k][i]=A[k][i]^A[k][j];
                i++;
                j--;
            }
        }
        return A;
    }
}
