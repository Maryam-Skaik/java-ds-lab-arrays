package arrays.assignment_solutions;

/**
 * Problem:
 * Merge two sorted arrays into one sorted array.
 *
 * Example:
 * a = [1, 4, 7]
 * b = [2, 3, 6]
 * result = [1, 2, 3, 4, 6, 7]
 *
 * Approach:
 * - Use three pointers:
 *   i → first array
 *   j → second array
 *   k → result array
 * - Compare elements and copy the smaller one
 * - Copy remaining elements after one array finishes
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */
public class MergeTwoSortedArrays {

    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[]
        while (i < a.length) {
            result[k++] = a[i++];
        }

        // Copy remaining elements of b[]
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {10, 20};
        int[] b = {1, 2, 3, 4};

        int[] merged = merge(a, b);

        for (int value : merged) {
            System.out.print(value + " ");
        }
    }
}
