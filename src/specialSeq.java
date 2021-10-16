public class specialSeq {
    public static void main(String[] args) {
        String s="GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        int c=0;
        int ans =0;
        int totLen = A.length();
        for(int i = totLen-1; i>=0; i--){
            if(A.charAt(i)=='G'){
                c++;
            } else if(A.charAt(i)=='A'){
                ans= ans + c;
            }
        }
        return ans;
    }
}
