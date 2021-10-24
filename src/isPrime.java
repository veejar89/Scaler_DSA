import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
       System.out.println(isPrimeCheck(getIntFromUser()));
    }

    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    private static boolean isPrimeCheck(int Number){
        if (Number==1){
            return false;
        }
        for (int i =2; i*i<=Number; i++){
            if(Number%i==0){
                return false;
            }
        }
        return true;
    }
}
