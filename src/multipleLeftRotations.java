public class multipleLeftRotations {
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int[] B = {1};
        leftRotation(A,B);
    }

    public static int[][] rightRotation(int[] A, int[] B) {
        int[][] out = new int[B.length][A.length];
        for(int i=0; i<B.length; i++){
            int val = B[i];
            val = val%A.length;
            for(int j=0; j<A.length; j++){
                out[i][j]=A[(A.length-val+j)%A.length];
            }
        }
        return out;
    }

    public static int[][] leftRotation(int[] A, int[] B){
        int[][] out = new int[B.length][A.length];
        for(int i=0; i<B.length; i++){
            int rotations = B[i];
            for(int j =0; j<A.length; j++){
                out[i][j]=A[(rotations+j)%A.length];
            }
        }
        return out;
    }
}
