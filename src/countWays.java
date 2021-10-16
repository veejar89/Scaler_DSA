public class countWays {
    public static void main(String[] args) {
        int[] A = {2, 1, 6, 4};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
       int count =0;
       int[] prefEven = new int[A.length];
       int[] prefOdd = new int[A.length];
        prefEven[0]=A[0];
        prefOdd[0] =0;
       for(int i=1; i<A.length; i++){
           if(i%2==0){
               prefEven[i] = prefEven[i-1]+A[i];
           } else {
               prefEven[i] = prefEven[i-1];
           }
           if(i%2!=0){
               prefOdd[i] = prefOdd[i-1]+A[i];
           } else {
               prefOdd[i] = prefOdd[i-1];
           }
       }
      if(prefEven[A.length-1]-prefEven[0]==prefOdd[A.length-1]-prefOdd[0]){
          count++;
      }
      if(prefEven[A.length-2]==prefOdd[A.length-2]){
          count++;
      }
      for(int i=1; i<A.length-1;i++){
          int k = prefEven[i-1] + prefOdd[A.length-1]-prefOdd[i];
          int l = prefOdd[i-1] + prefEven[A.length-1]-prefEven[i];
          if(k==l){
           count++;
          }
      }
        return count;
    }
}
