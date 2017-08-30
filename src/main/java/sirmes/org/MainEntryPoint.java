package sirmes.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samueirm on 8/28/17.
 */
public class MainEntryPoint {

    public static void main(String[] args) {

        final List<Integer> genericArray = new ArrayList<Integer>(){{
            add(10);
            add(2);
            add(4);
            add(5);
            add(3);
        }};

        System.out.println("Unsorted array: " + genericArray);

        final List<Integer> buSortedArray = new BubbleSort().sort(new ArrayList<Integer>(genericArray));
        System.out.println("Less efficient - Bubble sort: " + buSortedArray);

        final List<Integer> seSortedArray = new SelectionSort().sort(new ArrayList<Integer>(genericArray));
        System.out.println("Fair efficient - Selection Sort" + seSortedArray);

        final List<Integer> inSortedArray = new InsertSort().sort(new ArrayList<Integer>(genericArray));
        System.out.println("Most efficient - Insert sort: " + inSortedArray);
    }


}
