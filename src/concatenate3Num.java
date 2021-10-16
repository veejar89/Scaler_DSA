public class concatenate3Num {
    public static void main(String[] args) {
        System.out.println(solve(14, 14, 33));
    }

    public static int solve(int A, int B, int C) {
        int out = 0;
        if (A <= B && A <= C) {
            if (B <= C) {
                out = A*10000+B*100+C;
            } else {
                out = A*10000+C*100+B;
            }
        } else if (B <= A && B <= C) {
            if (A <= C) {
                out = B*10000 + A*100 + C;
            } else {
                out = B*10000 + C*100 + A;
            }
        } else {
            if (A <= B) {
                out = C*10000 + A*100 + B;
            } else {
                out = C*10000 + B*100 + A;
            }
        }
        return out;
    }
}
