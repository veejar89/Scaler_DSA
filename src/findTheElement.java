public class findTheElement {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        int B =2;
        System.out.println(solve(A,B));
    }
    public static int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        for(int i=0; i<N; i++){
            for(int j =0; j<M; j++){
                if(A[i][j]==B){
                    return (i+1)*1009+(j+1);
                }
            }
        }
        return -1;
    }
}
