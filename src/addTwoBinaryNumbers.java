import java.util.Scanner;

public class addTwoBinaryNumbers {
    public static void main(String[] args) {
        String first = getIntFromUser().toString();
        String second = getIntFromUser().toString();
        System.out.println(addBinary(first, second));
    }

    private static String getIntFromUser(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    private static String addBinary(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int carryover = 0;
        String res = "";
        int maxLen = Math.max(len1, len2);
        for (int currPlace=0; currPlace < maxLen; currPlace++){
            int a = currPlace < len1 ? num1.charAt(len1-1-currPlace)-'0':0;
            int b = currPlace < len2 ? num2.charAt(len2-1-currPlace)-'0':0;
            int temp = a + b + carryover;
            carryover = temp/2;
            res = temp%2 + res;
        }
    return (carryover==0) ? res:"1"+ res;
    }
}
