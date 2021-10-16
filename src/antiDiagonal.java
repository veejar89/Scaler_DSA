public class antiDiagonal {
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] A1 ={{1,2},{3,4}};
        diagonal(A1);
    }
    public static int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] out = new int[2*N-1][N];
        int i =0;
        for(int j=0; j<N; j++){
            int k=0;
            int s =0;
            int e =j;
            while(s<N && e>=0){
                out[i][k]=A[s][e];
                s++;
                e--;
                k++;
            }
            i++;
        }
        for(int a=1; a<N; a++){
            int s = a;
            int e = N-1;
            int k=0;
            while(s<N && e>=0){
                out[i][k]= A[s][e];
                s++;
                e--;
                k++;
            }
            i++;
        }
        return out;
    }
}
