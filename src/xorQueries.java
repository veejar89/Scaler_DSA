public class xorQueries {
    public static void main(String[] args) {
        int[] A={1,0,0,0,1};
        int[][] B= {{2,4},{1,5},{3,5}};
        solve2(A, B);
    }
    public static int[][] solve(int[] A, int[][] B) {
        int[][] c = new int[B.length][2];
        int xor = 0;
        for(int i=0; i<B.length; i++){
            for(int j=B[i][0]-1; j<B[i][1]; j++){
                xor = xor ^A[j];
            }
            int count =0;
            for(int l=0; l<A.length; l++){
                if(xor==A[l]){
                    count = count +1;
                }
            }
            c[i][0] = xor;
            c[i][1] = count;
        }
        return c;
    }
    public static int[][] solve2(int[] A, int[][] B){
        int[] xorArr = new int[A.length];
        int[] countArr = new int[A.length];
        int[][] out = new int[B.length][2];
        xorArr[0]=A[0];
        if(A[0]==0){
            countArr[0]= 1;
        } else {
            countArr[0]= 0;
        }
        for(int i=1; i<A.length; i++){
            xorArr[i]= xorArr[i-1]^A[i];
            if(A[i]==0){
                countArr[i] =   countArr[i-1] +1;
            } else {
                countArr[i] =   countArr[i-1];
            }
        }
        int q = 0;
        while(q<B.length){
            int L = B[q][0]-1;
            int R = B[q][1]-1;
            out[q][0]=xorArr[R]^xorArr[L]^A[L];
            if(L==0){
                out[q][1]=countArr[R];
            } else {
                out[q][1]=countArr[R]-countArr[L-1];
            }
            q++;
        }
        return out;
    }
}
