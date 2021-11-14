import java.util.Arrays;
import java.util.Scanner;

public class repeatingNumbers {
    public static void main(String[] args) {
        int[] A = {2308, 1447, 1918, 1391, 2308, 216, 1391, 410, 1021, 537, 1825, 1021, 1729, 669, 216, 1825, 537, 1995, 805, 410, 805, 602, 1918, 1447, 90, 1995, 90, 1540, 1161, 1540, 2160, 1235, 1161, 602, 880, 2160, 1235, 669};
       int[] out =  solve(A);
    }
    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    private static int[] solve(int[] A){
        int[] out;
        int xorRes=0;
        int set =0;
        int unset = 0;
        for (int a = 0; a< A.length; a++){
            xorRes = xorRes ^ A[a];
        }
        int pos = getFirstSetBitFromRight(xorRes);
        for (int i =0; i <A.length; i++){
            if(checkBit(A[i], pos)){
                set = set ^ A[i];
            } else {
                unset = unset ^ A[i];
            }
        }
        out = new int[]{set, unset};
        Arrays.sort(out);
        return out;
    }

    private static boolean checkBit(int number, int pos){
        if ((((number &(1<<pos))>>pos) & 1)==1) {
            return true;
        }
        return false;
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
