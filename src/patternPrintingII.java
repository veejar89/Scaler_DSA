public class patternPrintingII {
    public static void main(String[] args) {
        solve(3);
    }
    public static int[][] solve(int A) {
        int[][] out = new int[A][A];
        for(int i=0; i<A; i++){
            int val =1;
            for(int j=A-1; j>=A-i-1; j--){
                out[i][j]= val;
                val++;
            }
        }
        return out;
    }
}
