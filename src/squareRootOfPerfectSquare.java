import java.util.Scanner;

public class squareRootOfPerfectSquare {
    public static void main(String[] args) {
        System.out.println(squareRootForPerfectSquare(getIntFromUser()));
    }

    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    private static int squareRootForPerfectSquare(int perfectSquare){
        for (int i =1; i <=perfectSquare; i++){
            if(i*i==perfectSquare){
                return i;
            }
        }
        return -1;
    }
}
