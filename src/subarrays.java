public class subarrays {
        public static void main(String[] args) {
            int[] A = {1,2,3,4,5};
            int rotateBy = 6;
            rotateBy = rotateBy%A.length;
            A = revArray(A);
            A= revSubArray(A, 0, rotateBy-1);
            A= revSubArray(A, rotateBy, A.length-1);
           System.out.println(A);
        }
        public static int[] revArray(int[] array){
            int i =0;
            int j = array.length-1;
            while(i<j){
                array[i] = array[i]^array[j];
                array[j] = array[i]^array[j];
                array[i] = array[i]^array[j];
                i++;
                j--;
            }
            return array;
        }
        public static int[] revSubArray(int[] array, int startPos, int endPos){
            while(startPos<endPos){
                array[startPos]= array[startPos]^array[endPos];
                array[endPos]= array[startPos]^array[endPos];
                array[startPos]= array[startPos]^array[endPos];
                startPos++;
                endPos--;
            }
            return array;
        }

}
