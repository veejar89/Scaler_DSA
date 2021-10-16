public class sortByColor {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 0, 1, 2};
        int[] A1={0};
        sortColors(A1);
    }
    public static int[] sortColors(int[] A) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==0){
                count0++;
            }
            if(A[i]==1){
                count1++;
            }
            if(A[i]==2){
                count2++;
            }
        }
        int j=0;
        while(j<count0){
            A[j]=0;
            j++;
        }
        while(j<count0+count1){
            A[j]=1;
            j++;
        }
        while(j<count0+count1+count2){
            A[j]=2;
            j++;
        }
        return A;
    }
}
