public class leapYear {
    public static void main(String[] args) {
        System.out.println(solve(2024));
    }
    public static int solve(int A) {
        if(A%400==0){
           return 1;
        } else if(A%4==0 && A%100!=0){
            return 1;
        }
        return 0;
    }
}
