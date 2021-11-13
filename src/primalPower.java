public class primalPower {
    public static void main(String[] args) {
        int[] A = {-11, 7, 8, 9, 10, 11};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int count =0;
        if(A.length>0){
            for(int i =0; i<A.length;i++){
                if(checkIfPrime(A[i])){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static boolean checkIfPrime(int N){
        if(N>0) {
            if (N == 1) {
                return false;
            }
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
