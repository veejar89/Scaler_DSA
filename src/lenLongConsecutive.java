public class lenLongConsecutive {
    public static void main(String[] args) {
        solve("111011101");
    }
    public static int solve(String A) {
        int count_one =0;
        int max_count =0;
        int temp=0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='1'){
                count_one++;
                temp++;
            } else {
                max_count= Math.max(max_count, temp);
                temp=0;
            }
        }
        max_count=Math.max(max_count, temp);
        int[] left = new int[A.length()];
        int[] right = new int[A.length()];
        if(A.charAt(0)=='1'){
            left[0]=1;
        } else {
            left[0]=0;
        }
        if(A.charAt(A.length()-1)=='1'){
            right[A.length()-1]=1;
        } else {
            right[A.length()-1]=0;
        }
        for(int i=1; i<A.length(); i++) {
            if (A.charAt(i)=='1') {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 0;
            }
        }
        for(int i=A.length()-2; i>=0; i--){
            if(A.charAt(i)=='1'){
                right[i]=right[i+1]+1;
            } else {
                right[i]=0;
            }
        }
        for(int i=1; i<A.length()-1; i++){
                int sum = left[i-1]+right[i+1];
                if(sum<count_one){
                    max_count=Math.max(max_count, sum+1);
                } else {
                    max_count=Math.max(max_count, sum);
                }
        }
        return max_count;
    }
}
