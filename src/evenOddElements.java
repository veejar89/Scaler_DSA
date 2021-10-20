import java.util.Scanner;

public class evenOddElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        for(int t=0; t<testCase; t++){
            int even=0;
            int odd=0;
            int arrLen = s.nextInt();
            if(arrLen>0){
                int[] array = new int[arrLen];
                for(int i=0; i<arrLen; i++){
                    array[i]= s.nextInt();
                }
                for(int j =0; j<arrLen; j++){
                    if(array[j]!=0){
                        if(array[j]%2==0){
                            even = even+1;
                        } else {
                            odd =odd+1;
                        }
                    }
                }
                System.out.println(Math.abs(even-odd));
            }
        }
    }

    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
}
