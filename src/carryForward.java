public class carryForward {
    public static void main(String[] args) {
        int[] A = {3,-2,4,-1,2,6};
        carryforward(A);
    }

    private static void carryforward(int[] A){
        for(int i =0; i<A.length; i++){
            int s =0;
            for(int j=i; j<A.length; j++){
                s = s+A[j];
                System.out.println(s);
            }
        }
    }
}
