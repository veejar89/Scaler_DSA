public class minimumXor {
    public static void main(String[] args) {
    System.out.println(solve(4,6));
    }
    public static int solve(int A, int B) {
       int out = A;
       int checkBits = 0;
       int xorRes =0;
        xorRes = out ^ A;
        checkBits = getNumberOfCheckBits(out);
        if(B==checkBits){
            return out;
        } else {
        int size = B - checkBits;
        if(size >0) {
            for (int a = 0; a <= 30; a++) {
                if (!checkBit(out, a)) {
                    out = out | (1 << a);
                    size = size - 1;
                    if (size == 0) {
                        break;
                    }
                }
            }
        } else {
            for (int a = 0; a <= 30; a++) {
                if (checkBit(out, a)) {
                    out = out ^ (1 << a);
                    size = size + 1;
                    if (size == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println("Output is: " + (out^A));
        }
        return out;
    }
    private static int getNumberOfCheckBits(int num){
        int cnt = 0;
        while(num>0){
            if((num & 1) ==1){
                cnt ++;
            }
            num = num >> 1;
        }
       return cnt;
    }
    private static boolean checkBit(int number, int pos){
        if ((((number &(1<<pos))>>pos) & 1)==1) {
            return true;
        }
        return false;
    }
}
