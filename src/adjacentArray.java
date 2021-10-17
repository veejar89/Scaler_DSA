public class adjacentArray {
    public static void main(String[] args) {
        int[] array = {2};
        System.out.println(solve(array));
    }

    public static int[] solve(int[] A) {
        if(A.length>1){
            int[] out = new int[A.length-1];
            for(int i =0; i <out.length; i++){
                out[i]=A[i+1]-A[i];
            }
            return out;
        } else {
            return new int[0];
        }
    }
}
