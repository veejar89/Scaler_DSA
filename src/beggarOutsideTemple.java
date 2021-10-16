public class beggarOutsideTemple {
    public static void main(String[] args) {
        int A = 5;
        int[][] B ={{1, 2, 10},{2, 3, 20},{2, 5, 25}};
        solve(A,B);
    }
    public static int[] solve(int A, int[][] B) {
        int[] out = new int[A];
        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            int amount = B[i][2];
            for (int j = startIndex - 1; j < endIndex; j++) {
                out[j] = out[j] + amount;
            }
        }
        return out;
    }
}
