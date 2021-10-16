public class overlapRectangle {
    public static void main(String[] args) {
        System.out.println(solve(1,1,3,3,4,4,6,6));
    }
    public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if((C<=E)||(A>=G)||(D<=F)||(B>=H)){
            return 0;
        }
        return 1;
    }
}
