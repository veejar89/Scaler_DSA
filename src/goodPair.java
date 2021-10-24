public class goodPair {
    public static void main(String[] args) {
        int[] array = {1,2,2};
        int val = 4;
        System.out.println(solve(array, val));
    }
    public static int solve(int[] A, int B) {
        int checkVal =0;
       for(int i =0; i<A.length; i++){
           checkVal = B- A[i];
           for(int j=0; j<A.length; j++){
               if(i!=j) {
                   if (A[j] == checkVal) {
                       return 1;
                   }
               }
           }
       }
        return 0;
    }
}
