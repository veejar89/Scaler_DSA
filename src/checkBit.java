public class checkBit {
    public static void main(String[] args) {
        System.out.println(getFirstSetBitFromRight(10));
    }

    private static int getFirstSetBitFromRight(int N) {
       int a = 0;
       for(int i =0; i<31; i++){
           if ((((N &(1<<i))>>i) & 1)==1) {
               a = i;
               break;
           }
       }
       return a;
    }
}
