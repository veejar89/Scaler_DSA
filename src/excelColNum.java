public class excelColNum {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }
    public static int titleToNumber(String A) {
        int ascii =0;
        int p = 1;
        for(int i=A.length()-1; i>=0; i--){
            //ascii = (int) (ascii + (A.charAt(i)-'A'+1)*power(26,A.length()-i-1));
            ascii = (int) (ascii +(A.charAt(i)-'A'+1)*p);
            p = p*26;
        }
        return ascii;
    }
    private static int power(int N, int P){
      int ans =1;
      for(int i=1; i<=P; i++){
          ans = ans * N;
      }
      return ans;
    }
}
