public class subarrays2 {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        System.out.println(solve3(A));
        String str = "Test";
        str.length();
    }
    public static void solve(int[] A){
        for(int i=0; i <A.length; i++){
            for(int j=i; j<A.length; j++){
                int sum =0;
                for(int k=i; k<=j; k++){
                    sum = sum+ A[k];
                }
                System.out.println(sum);
            }
        }
    }
    public static long solve2(int[] A){
        long totSum=0;
        for(int i=0; i <A.length; i++){
            int s=0;
            for(int j=i; j<A.length; j++){
                s=s+A[j];
                totSum = totSum + s;
            }
        }
        return totSum;
    }
    public static long solve3(int[] A){
        long sum =0;
        for(int i =0; i<A.length; i++){
            sum = sum+((i+1)*(A.length-i))*A[i];
        }
        return sum;
    }
}
