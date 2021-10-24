public class fizzBuzzDemo {
    public static void main(String[] args) {
        int A = 15;
        System.out.println(fizzBuzz(A));
    }

    public static String[] fizzBuzz(int A) {
        int counter = 1;
        String[] fb = new String[A];
        for (int i = 0; i < A; i++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                fb[i] = "FizzBuzz";
                counter= counter+1;
            } else if (counter % 3 == 0) {
                fb[i] = "Fizz";
                counter = counter+1;
            } else if (counter % 5 == 0) {
                fb[i] = "Buzz";
                counter = counter+1;
            } else {
                fb[i] = counter + "";
                counter = counter + 1;
            }
        }
        return fb;
    }
}
