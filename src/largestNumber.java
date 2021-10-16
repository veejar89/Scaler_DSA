import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        int[] A = {1,0,0,9};
        System.out.println(largestNumber(A));
    }

    public static String largestNumber(final int[] A) {
        String out = "";
        ArrayList<String> arList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            arList.add(A[i] + "");
        }
        Collections.sort(arList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });
        Iterator it = arList.iterator();
        String val ="";
        int pos =0;
        while (it.hasNext()) {
            val = it.next().toString();
            out = out + val;
            pos = pos + Integer.parseInt(val);
        }
        if(pos==0){
           return "0";
        }
        return out;
    }
}
