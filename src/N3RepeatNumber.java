import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N3RepeatNumber {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(7);
        System.out.println(repeatedNumber(a));
    }
    public static int repeatedNumber(final List<Integer> a) {
        if(a.size()>1) {
            int elem1 = a.get(0);
            int elem2 = 0;
            int freq1 = 1;
            int freq2 = 0;
            int cnt1 = 0;
            int cnt2 = 0;
            for (int i = 1; i < a.size(); i++) {
                if (elem1 == a.get(i) || elem2 == a.get(i)) {
                    if (elem1 == a.get(i)) {
                        freq1++;
                    } else {
                        freq2++;
                    }
                } else if (freq1 == 0 || freq2 == 0) {
                    if (freq1 == 0) {
                        elem1 = a.get(i);
                        freq1++;
                    } else {
                        elem2 = a.get(i);
                        freq2++;
                    }
                } else {
                    freq1--;
                    freq2--;
                }
            }
            for (int i = 0; i < a.size(); i++) {
                if (elem1 == a.get(i)) {
                    cnt1++;
                }
                if (elem2 == a.get(i)) {
                    cnt2++;
                }
            }
            if (cnt1 > a.size() / 3 || cnt2 > a.size() / 3) {
                if (cnt1 > a.size() / 3) {
                    return elem1;
                } else {
                    return elem2;
                }
            }
            return -1;
        } else {
            return a.get(0);
        }
    }
}
