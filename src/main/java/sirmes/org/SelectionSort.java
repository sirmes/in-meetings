package sirmes.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samueirm on 8/29/17.
 */
public class SelectionSort {
    public List<Integer> sort(ArrayList<Integer> array) {

        //O(2) - Selects the smallest and swaps at each outer loop cycle
        for (int i=0; i < array.size() -1; i++) {
            int minIndex = i;

            for (int j=i+1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }

            //Swap
            Integer aux = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, aux);
        }
        return array;
    }
}
