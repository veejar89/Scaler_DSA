public class patternPrinting {
    public static void main(String[] args) {
        solve(4);
    }
    public static int[][] solve(int A) {
        int[][] out = new int[A][A];
        for(int i=0; i<A;i++){
            int val =1;
            for(int j=0; j<=i; j++){
                out[i][j]=val;
                val= val+1;
            }
        }
        return out;
    }
}
