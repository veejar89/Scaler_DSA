import java.util.*;

public class expandingArray {
    public static void main(String[] args) {
        int[] arr = {9,4};
        System.out.println(sizeExpandArray(arr));
    }
    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int sizeExpandArray(int[] A) {
        int out = 0;
        int arrLen = A.length;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        intArrayToList(newArr, A);
        for(int a=0; a< arrLen-1; a++){
           for(int b=1; b<arrLen; b++){
               if(a!=b) {
                   out = newArr.get(a) / newArr.get(b);
                   if (!newArr.contains(out)) {
                       newArr.add(out);
                       arrLen = arrLen + 1;
                   }
               }
           }
        }
        return newArr.size();
    }

    private static ArrayList<Integer> intArrayToList(ArrayList<Integer> destArray, int[] array){
        for(int i: array){
            destArray.add(i);
        }
        return destArray;
    }
}
