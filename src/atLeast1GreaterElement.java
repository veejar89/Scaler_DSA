public class atLeast1GreaterElement {
    public static void main(String[] args) {

    }
    public static int solve(int[] A){
        int max = A[0];
    int cnt =0;
    for(int i =1; i<A.length; i++){
        if(max<A[i]){
            max = A[i];
            cnt = 0;
        } else if(max==A[i]) {
            cnt = cnt+1;
        }
    }
    return cnt;
    }
}
