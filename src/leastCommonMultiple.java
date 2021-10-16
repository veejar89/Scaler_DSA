public class leastCommonMultiple {
    public static void main(String[] args) {
        System.out.println(LCM(2,6));
    }
    public static int LCM(int A, int B) {
        int gcd=1;
        for(int i=1; i<=A && i<=B; i++){
            if(A%i==0 && B%i==0){
             gcd=i;
            }
        }
        int lcm = (A*B)/gcd;
        return lcm;
    }
}
