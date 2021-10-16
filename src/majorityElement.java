public class majorityElement {
    public static void main(String[] args) {
        int[] A ={1,1,1,1,1,1,1,2,3,3,3};
        System.out.println(majorityElement(A));
    }
    public static int majorityElement(final int[] A) {
        int elem=A[0];
        int freq=1;
        int count =0;
        for(int i=1; i<A.length; i++){
            if(elem==A[i]){
                freq++;
            } else if(freq==0) {
                elem =A[i];
                freq++;
            } else {
                freq--;
            }
        }
        for(int i=0; i<A.length; i++){
            if(A[i]==elem){
               count++;
            }
        }
        if(count>A.length/2){
            return elem;
        }
        return -1;
    }
}
