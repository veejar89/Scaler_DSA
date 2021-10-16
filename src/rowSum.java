public class rowSum {
    public static void main(String[] args) {
        int[][] A ={{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        solve(A);
    }
    public static int[] solve(int[][] A) {
        int[] out = new int[A.length];
        int i =0;
        while(i<A.length){
            int sum=0;
            for(int j=0; j<A[0].length; j++){
                sum = sum+A[i][j];
            }
            out[i]=sum;
            i++;
        }
        return out;
    }
}
