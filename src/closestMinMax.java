public class closestMinMax {
    public static void main(String[] args) {
        int[] A = {4, 4, 4, 4, 4};
        System.out.println(solve(A));
    }
    private static int solve(int[] A){
        int len =A.length;
        //Step 1: get Max and Min
        int maxVal=A[0];
        int minVal=A[0];
        for(int i =1; i<A.length; i++){
            if(maxVal<A[i]){
                maxVal = A[i];
            }
            if(minVal>A[i]){
                minVal=A[i];
            }
        }
        if(maxVal==minVal){
            return 1;
        }
        //Step 2: set maxIndex and minIndex
        int minIndex = 2*A.length;
        int maxIndex = 2*A.length;

        //Step 3: get smallest subarray length
        for(int j=A.length-1; j >=0; j--){
            if(A[j]==maxVal){
                len = Math.min(len, minIndex-j+1);
                maxIndex=j;
            } else if(A[j]==minVal) {
                len = Math.min(len, maxIndex-j+1);
                minIndex=j;
            }
        }
        return len;
    }
}
