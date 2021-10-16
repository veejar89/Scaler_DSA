public class subarray4_LeastAverage {
    public static void main(String[] args) {
        int[] A = {3, 7, 5, 20, -10, 0, 12};
        int B = 2;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int sum =0;
        int returnIndex = 0;
        for(int i=0; i<B; i++){
           sum = sum + A[i];
        }
        int min = sum;
        for(int i =1; i<=A.length-B; i++){
            int j = i + B-1;
            sum = sum - A[i-1];
            sum = sum + A[j];
            if(min> sum){
                min = sum;
                returnIndex =i;
            }
        }
        return returnIndex;
    }
}
