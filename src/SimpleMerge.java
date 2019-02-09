/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int x = 0;
        int y=0;
        int z=0;
        while (x < merged.length) {
            if (y == arr1.length || z == arr2.length) {
                if (y == arr1.length) {
                    merged[x++] = arr2[z++];

                }
                else {
                    merged[x++] = arr1[y++];
                }
            }
            else {
                if (arr1[y] < arr2[z]) {
                    merged[x++] = arr1[y++];
                }
                else {
                    merged[x++] = arr2[z++];
                }
            }
        }

        return merged;
    }
}