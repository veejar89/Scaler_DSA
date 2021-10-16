public class twoUniqueElements {
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,4,3,1,6,5};
        solve(A);
    }
    private static void solve(int[] A){
            //xor of all elements
        int ans =0;
        for(int i=0; i<A.length; i++){
            ans = ans ^ A[i];
        }
        // get pos which is set
        int temp = ans;
        int i=0;
        while(temp > 0){
            if((temp&1)==1){
                temp =0;
            }
            temp = temp >>1;
            i = i + 1;
        }

        //split set and unset
        int set =0;
        int unset =0;
        for(int j =0; j<A.length; j++ ){
            if(checkbit(A[j], i)){
                set = set ^A[j];
            } else {
                unset = unset ^A[j];
            }
        }
        System.out.println("two unique numbers are " + set + " , " + unset);
    }
    public static boolean checkbit(int N, int pos){
        if((N &(1<<pos))!=0){
            return true;
        }
        return false;
    }

}
