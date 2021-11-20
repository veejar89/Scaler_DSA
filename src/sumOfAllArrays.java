public class sumOfAllArrays {
        public static void main(String[] args){
            int[] A = {0,1,2,3,4};
            int N = A.length;

            for(int i=0; i<N; i++){
                int sum = 0;
                for(int j =i; j<N; j++){
                    sum = sum+A[j];
                    System.out.println(sum);
                }
            }
        }
}
