public class abModulo {
    public static void main(String[] args) {
        int A = 5;
        int B =10;
        System.out.println(solve(A, B));
    }
    public static  int solve(int A, int B) {
        return Math.abs(A-B);
    }
}
