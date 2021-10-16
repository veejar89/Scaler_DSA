public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    //test
    public static int solve(int A) {
        int x=1;
        int ans =0;
        while(A>0){
            x=x*5;
            if(A%2==1){
                ans = ans+x;
            }
            A=A/2;
        }
        return ans;

    }
}
