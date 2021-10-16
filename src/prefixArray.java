public class prefixArray {
    public static void main(String[] args) {
        int[] A ={3, 6, 2, 8, 9, 2}; // 3 9 11 19 28 30 30-
        int q =4;
        int[] l = {2,4,1,3};
        int[] r = {3,4,5,5};
        solve(A, q, l, r);
        //10, 9, 27, 19
    }
    private static void solve(int[] A, int q, int[] l, int[] r){
        for(int i =1; i<A.length; i++){ //O(N)
            A[i]=A[i-1] + A[i];
        }
        int i = 0;
        while(q>0){
           System.out.println(A[r[i]]-A[l[i]-1]); //O(Q)
           i++;
           q--;
        }
    }

    //total O(max(Q,N))
}
