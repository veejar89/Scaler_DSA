import java.util.ArrayList;

public class expanArray {
    public static void main(String[] args) {
    int[] arrGiven = {1,1};
    System.out.println(solve(arrGiven));
    }
    private static int solve(int[] A){
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i =0; i< A.length; i++){
            if(!newArr.contains(A[i])){
                newArr.add(A[i]);
            }
        }
        int i =0;
        while(i<newArr.size()){
            for(int j =0; j<newArr.size(); j++){
                if(i==j){
                    continue;
                }
                int m1 = Math.max(newArr.get(i), newArr.get(j));
                int m2 = Math.min(newArr.get(i), newArr.get(j));
                int newEle = m1/m2;
                if(!newArr.contains(newEle)){
                    newArr.add(newEle);
                }
            }
            i+=1;
        }
        return newArr.size();
    }
}
