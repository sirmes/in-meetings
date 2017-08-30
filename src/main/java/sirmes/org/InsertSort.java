package sirmes.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samueirm on 8/29/17.
 */
public class InsertSort {
    public List<Integer> sort(ArrayList<Integer> array) {

        //O(2) - Compares current and past and swaps greater with smallest
        for (int i=1; i < array.size(); i++) {

            Integer current = array.get(i);
            int j = i-1;
            while (j >= 0 && array.get(j) > current) {
                array.set(j+1, array.get(j));
                j = j -1;
            }

            array.set(j+1, current);
        }
        return array;
    }
}
