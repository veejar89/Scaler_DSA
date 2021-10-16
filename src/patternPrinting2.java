public class patternPrinting2 {
    public static void main(String[] args) {
        solve(4);
    }
    public static int[][] solve(int A){
        int[][] array = new int[A][A];
        for(int i=0; i <A; i++){
            int count =1;
            for(int j =A-1; j>=A-i-1; j--){
                array[i][j]= array[i][j]+count;
                count = count+1;
            }
        }
        return array;
    }
}
