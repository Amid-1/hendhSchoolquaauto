import java.util.Arrays;
import java.util.Random;

public class SortRandomArrayList {
    public static int[][] generateAndSortArrays(int n) {
        Random random = new Random();
        int[][] arrays = new int[n][];

        for (int i = 0; i < n; i++) {
            int size = random.nextInt(10) + 1;
            arrays[i] = RandomArrayList.generateRandomArray(size);
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Arrays.sort(arrays[i]);
            } else {
                Arrays.sort(arrays[i]);
                ArrayReverse.reverseArray(arrays[i]);
            }
        }

        return arrays;
    }

}
