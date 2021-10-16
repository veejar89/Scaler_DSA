public class equilibriumIndex {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        System.out.println(equiIndex(A));
    }

    private static int equiIndex(int[] A){
        int out =-1;
        int[] prefix = new int[A.length];
        //calc prefix Sum
        prefix[0]= A[0];
        for(int i =1; i<A.length; i++){
            prefix[i]= prefix[i-1] + A[i];
        }

        int c=0;
        for(int j=0; j<A.length; j++){
            int leftSum = prefix[j]-prefix[0] + A[0];
            int rightSum = prefix[A.length-1]-prefix[j] +A[j];
            if(leftSum==rightSum){
                return j;
            }
        }
        return out;
    }
}

