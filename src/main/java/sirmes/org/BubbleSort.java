package sirmes.org;

import java.util.List;

/**
 * Created by samueirm on 8/29/17.
 */
public class BubbleSort {

    //O(n2) - Two loops - Compares and swaps as goes
    public List<Integer> sort(List<Integer> array) {

        for(int i=0;i<array.size();i++) {
            for (int j=i+1; j<array.size(); j++) {
                if (array.get(i) > array.get(j)) {
                    int aux = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, aux);
                }
            }
        }

        return array;
    }
}
