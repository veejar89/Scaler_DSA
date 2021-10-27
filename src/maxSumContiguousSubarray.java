public class maxSumContiguousSubarray {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray2(A));
    }
    public static int maxSubArray(final int[] A) {
        int maxSum=Integer.MIN_VALUE;
        for(int a=0; a<A.length; a++){
            int Sum =0;
            for(int b= a; b<A.length; b++){
                Sum = Sum + A[b];
                if(maxSum<Sum){
                    maxSum= Sum;
                }
            }
        }
        return maxSum;
    }
    public static int maxSubArray2(final int[] A){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<A.length;i++){
            sum = sum+A[i];
            if(maxSum<sum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
