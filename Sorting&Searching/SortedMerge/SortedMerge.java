import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedMerge {

    /**
     * ? given two sorted arrays, A and B, where A has a large enough buffer at the
     * ? end to hold B. Write a method to merge B into A in sorted order
     */

    // * solution with java 8 streams
    public static int[] mergeArrays(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] a1 = { 3, 7, 9 };
        int[] a2 = { 4, 6, 8, 11 };
        System.out.println("Merged array for a1 and a2 -> " + Arrays.toString(mergeArrays(a1, a2)));
    }
}