public class stringMod {
    public static void main(String[] args) {
        System.out.println(findMod("43535321", 47));
    }
    public static int findMod(String A, int B) {
        int ans =0;
        int pow =1;
        for(int i=A.length()-1; i>=0; i--){
            ans = ans + (A.charAt(i)-'0')*pow;
            ans = ans%B;
            pow = (pow*10)%B;
        }
        return ans;
    }
}