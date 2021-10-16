public class subarrays3 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        int B = 3;
        solve(A, B);
    }
    public static void solve(int[] array, int len){
        for(int i=0; i< array.length-len; i++){
            int j = i+(len-1);
            System.out.println(i + "," + j);
        }
    }
}
