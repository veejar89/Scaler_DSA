public class spiralMatrix2 {
    public static void main(String[] args) {
        generateMatrix(1);
    }

    public static int[][] generateMatrix(int A) {
        int[][] out = new int[A][A];
        int i = 0;
        int j = 0;
        int val = 0;
        while (A > 1) {
            for (int a = 0; a <= A - 2; a++) {
                val = val + 1;
                out[i][j] = val;
                j++;
            }
            for (int a = 0; a <= A - 2; a++) {
                val = val + 1;
                out[i][j] = val;
                i++;
            }
            for (int a = 0; a <= A - 2; a++) {
                val = val + 1;
                out[i][j] = val;
                j--;
            }
            for (int a = 0; a <= A - 2; a++) {
                val = val + 1;
                out[i][j] = val;
                i--;
            }
            A = A - 2;
            i++;
            j++;
        }
        if(A==1){
          out[i][j]=val+1;
        }
        return out;
    }

}
