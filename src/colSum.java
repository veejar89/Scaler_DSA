public class colSum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        solve(A);
    }
    public static int[] solve(int[][] A) {
        int[] out= new int[A[0].length];
        int N=0;
        while(N<A[0].length){
            int sum =0;
            for(int a=0; a<A.length; a++){
                sum = sum+A[a][N];
            }
            out[N]=sum;
            N++;
        }
        return out;
    }
}
