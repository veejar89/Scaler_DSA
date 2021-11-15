public class reverseBits {
    public static void main(String[] args) {
        long a = 10;
        System.out.println(reverse(a));
    }
    public static long reverse(long a) {
        long rev =0;
        long mask = 1;
        for(int b=0; b <32; b++){
            if(checkBit(a,b)){
                rev = rev |(mask<<31-b);
            }
        }
        return rev;
    }

    private static boolean checkBit(long number, int pos){
        if ((((number &(1<<pos))>>pos) & 1)==1) {
            return true;
        }
        return false;
    }
}
