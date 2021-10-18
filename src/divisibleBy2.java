import java.util.Scanner;

public class divisibleBy2 {
    public static void main(String[] args) {
        System.out.println(divisibleBy2Times(getIntFromUser()));
    }

    private static int getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    private static int divisibleBy2Times(int number){
        return (int) (Math.log(number)/Math.log(2));
    }
}
