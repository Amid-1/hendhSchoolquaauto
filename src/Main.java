import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[][] sortedArrays = SortRandomArrayList.generateAndSortArrays(n);
        for (int[] array : sortedArrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}
