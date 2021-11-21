public class sumOfMaxAndMin {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 1};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i <A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
            if(A[i]> max){
                max = A[i];
            }
        }
        return max+min;
    }
}
