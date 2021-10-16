public class divisibilityBy8 {
    public static void main(String[] args) {
    String A = "16";
    String A1= "5879000";
    solve(A1);
    }
    public static int solve(String A) {
        String ans="";
       if(A.length()>3){
           for(int a= A.length()-3; a<A.length();a++){
               ans = ans + A.charAt(a);
           }
           if(Integer.parseInt(ans)%8==0){
               return 1;
           }
       } else {
           if(Integer.parseInt(A)%8==0){
               return 1;
           }
       }
        return 0;
    }
}
